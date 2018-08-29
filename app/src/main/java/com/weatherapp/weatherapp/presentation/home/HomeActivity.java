package com.weatherapp.weatherapp.presentation.home;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.weatherapp.weatherapp.BaseApplication;
import com.weatherapp.weatherapp.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Activity for hoem screen
 */
public class HomeActivity extends AppCompatActivity implements
        HomeContract.HomeView {

    @BindView(R.id.swipe_refresh_layout)
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView(R.id.recycleview)
    RecyclerView recyclerView;
    @BindView(R.id.title)
    TextView titleTextView;
    @BindView(R.id.town)
    TextView townTextView;
    @BindView(R.id.error)
    TextView errorTextView;

    private HomeAdapter adapter;

    private HomeContract.HomePresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ButterKnife.bind(this);


        adapter = new HomeAdapter();
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
               onRefreshItems();
            }
        });

        presenter = createPresenter();
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.attachView(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.detachView();
    }

    private HomeContract.HomePresenter createPresenter() {
        HomePresenterImpl presenter = new  HomePresenterImpl();
        ((BaseApplication)getApplication()).getApplicationComponent().inject(presenter);
        return presenter;
    }

    public void onRefreshItems() {
        if ( presenter != null ) {
            presenter.refreshData();
        }
    }

    @Override
    public void showResults(List<HomeItem> list) {
        adapter.setListItems(list);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void setTown(String town) {
        townTextView.setText(String.format(getResources().getString(R.string.town), town));
    }

    @Override
    public void showError() {
        errorTextView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideError() {
        errorTextView.setVisibility(View.GONE);
    }

    @Override
    public void showLoading() {
        swipeRefreshLayout.setRefreshing(true);
    }

    @Override
    public void hideLoading() {
        swipeRefreshLayout.setRefreshing(false);
    }
}
