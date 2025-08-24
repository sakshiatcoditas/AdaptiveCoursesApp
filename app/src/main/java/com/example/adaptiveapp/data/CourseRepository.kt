package com.example.adaptiveapp.data

class CourseRepository {
    fun getCourses(): List<Course> = CourseDataSource.courses
    fun getCourseById(id: Int): Course? = CourseDataSource.courses.find { it.id == id }
}
