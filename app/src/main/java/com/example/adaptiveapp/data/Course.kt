package com.example.adaptiveapp.data

data class Course(
    val id: Int,
    val title: String,
    val description: String
)

object CourseDataSource {
    val courses = listOf(
        Course(
            1,
            "Kotlin Basics",
            "Learn the fundamentals of Kotlin programming language including variables, data types, control flow, functions, and classes. This course is designed for beginners and helps you quickly get started with Kotlin syntax and best practices."
        ),
        Course(
            2,
            "Android Compose",
            "Build modern, declarative UIs with Jetpack Compose. You will learn how to create Composables, manage state, apply Material Design components, and structure layouts efficiently. By the end, you'll be confident in creating beautiful UIs entirely in Kotlin."
        ),
        Course(
            3,
            "MVVM Pattern",
            "Understand the Model-View-ViewModel (MVVM) architecture pattern in Android. Learn how to separate concerns, manage UI state with ViewModel, expose LiveData or StateFlow, and interact with repositories for cleaner and more testable apps."
        ),
        Course(
            4,
            "Coroutines in Kotlin",
            "Master asynchronous programming with Kotlin Coroutines. Explore structured concurrency, suspend functions, coroutine builders (launch, async), and flows for reactive data streams. This will help you write efficient, non-blocking code."
        ),
        Course(
            5,
            "Room Database",
            "Learn how to store, query, and manage data locally with Room persistence library. Topics include entities, DAO interfaces, database setup, migrations, and using coroutines or flows with Room for real-time updates."
        ),
        Course(
            6,
            "Navigation Component",
            "Implement seamless navigation in your Android apps using the Jetpack Navigation Component. Discover how to set up nav graphs, handle deep links, pass arguments between screens, and use Safe Args for type safety."
        ),
        Course(
            7,
            "Dependency Injection",
            "Understand the concept of Dependency Injection (DI) and how to use Hilt in Android apps. This course explains how DI improves modularity, testability, and scalability by managing object lifecycles and dependencies automatically."
        ),
        Course(
            8,
            "Networking with Retrofit",
            "Fetch, post, and update data over the network using Retrofit. Learn how to define APIs with interfaces, handle JSON parsing with converters, use interceptors with OkHttp, and manage asynchronous network calls with coroutines."
        ),
        Course(
            9,
            "Jetpack WorkManager",
            "Schedule and manage background tasks reliably with WorkManager. Explore one-time and periodic requests, chaining work, constraints like charging or Wi-Fi, and integrating with coroutines for smooth background operations."
        ),
        Course(
            10,
            "Compose Animations",
            "Add interactivity and life to your Jetpack Compose UI with animations. Learn about simple animations, transitions, animated visibility, gestures, and how to create smooth motion to delight your users."
        )
    )
}
