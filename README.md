
# Project Introduction:

Weather App Assignment to show weather forecast for the upcoming 5 days<br/>
Weather Forcasting API for city of London<br/>

This Mobile application is capable to display the Wether report from open weather map.
Application consumes the below API and integrates the response data with UI. <br/>
http://api.openweathermap.org/data/2.5/forecast?id=524901&APPID=<YOUR_APP_ID>


## App Implemantation and Environment:

Application supports Android SDK 4.0.3 and above versions.<br/>
Tools: Android Studio, Android SDK and java <br/>
Fallow the below link to Generate the API Key<br/>

https://openweathermap.org/appid


# Application Architecture

This application code is developed and implemented to provide 3-tier architecturewith below layers.

## data layer:
This layer is responsible to offer multiple data sources, both remotely (network requests) and locally (share pref, files, database, etc for caching and offline support). Currently, only the network request is supported

## domain/business layer:
This layer interacts with the data layer via repositories provided in this package, to allow separation of concerns, decouple network/database models from view models and provide mapping/filters/chain of network request etc when needed<br/><br/>

## presentation layer:
This layer is responsibile of handling the UI. Our presentation layer is organised by user cases (eg, home) and it follows MVP pattern. Basic classes to handle the view-presenter binding are provided in the base sub-package

## MVP

Model–view–presenter (MVP) is a derivation of the model–view–controller (MVC) architectural pattern which mostly used for building user interfaces. In MVP, the presenter assumes the functionality of the “middle-man”. All presentation logic is pushed to the presenter. MVP advocates separating business and persistence logic out of the Activity.<br/>

Im this application every user case has a contract class, providing View and Presenter interfaces; this provides the way view and provider can communicate each other by exposing interface methods<br/>
Activity (in principle, also fragments or android views in a more complex app) implementing the view interface in the contract; views are responsible of creating the corresponding presenter, propagate to the presenter lifecycle events, click events, etc.<br/>
Presenter Java class, that handles all the business logic of the view. Ideally, no Android code should appear in the presenter so that we can completely test the presenter with unit tests<br/>
Model classes: the model storing data for the view. this should not be confused with the pojo classes in the network layer</br>
Additional android classes (adapters, etc)

#Libraries

### Dagger2 :
Dependency injection framework (does not use reflection). While its surely true that dependecy injection can be achieve without using any DI framework, dagger2 makes things easier without performance penalities at runtime. For example, it's easy with dagger to expose scheduler threads and replace them for unit tests.  <br/><br/>
### RxJava and related:
Implementation of the observable pattern with a lot of built in support for map/filter, etc.. Its dotchain syntax (together with retrolambda, not used in this project) brings a flavour of functional programming "style" in the android platform, alleviating certain "callback hells" that can appear when handling multiple data sources, multiple scenarios, etc and that otherwise would be handled using a lot of boolean flags difficult to manage.<br/><br/>
#### Retrofit2:
Static-type REST client, useful to provide clean interface to APIs; it also supports rx out of the box  <br/>
### logansquare:
This is one of the Json decoder library which is a fast json decoder/serialiser. gson and jackson are other popular choices with many features.
### butterknife:
This is to just to remove some boilerplate of findViewById code


#Improvements

As per given time lines I have concentrated mostly on application design, archtecture and integrating required third party libraries.<br/>
<b> UI/UX Design and experience:</b> I am currently implemented a simple UI with recycular view. But it can be  more efficient with advanced UI using Constraint Layouts and Meterial design etc<br/>
<b>Offline/cache support:<b> Ideally, this should be provided in the "data>local" package (currently empty) <br/>

