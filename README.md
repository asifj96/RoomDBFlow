# Room Database Queries with Flow

This app displays a list of bus stops and arrival times. Tapping a bus stop on the first screen will
display a list of all arrival times for that particular stop.

The bus stops are stored in a Room database. Schedule items are represented by the `Schedule` class
and queries on the data table are made by the `ScheduleDao` class. The app includes a view model to
access the `ScheduleDao` and format data to be display in a list, using `Flow` to send data to a
recycler view adapter.

# What you'll learn

1. Migrate to Kotlin Gradle DSL.
2. Represent database tables as Kotlin objects (entities).
3. Define the database class to use Room in the app, and pre-populate a database from a file.
4. Define the DAO class and use SQL queries to access the database from Kotlin code.
5. Define a view model to allow the UI to interact with the DAO.
6. How to use ListAdapter with a recycler view.
7. The basics of Kotlin flow and how to use it to make the UI respond to changes in the underlying
   data.

# Reference

https://proandroiddev.com/gradle-groovy-to-kotlin-dsl-in-15-minutes-d3129aff227e
https://medium.com/geekculture/android-listadapter-a-better-implementation-for-the-recyclerview-1af1826a7d21
https://medium.com/androiddevelopers/room-flow-273acffe5b57