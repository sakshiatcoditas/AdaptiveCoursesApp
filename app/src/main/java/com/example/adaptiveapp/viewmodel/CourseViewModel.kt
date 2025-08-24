package com.example.adaptiveapp.ui

import androidx.lifecycle.ViewModel
import com.example.adaptiveapp.data.Course
import com.example.adaptiveapp.data.CourseRepository

class CourseViewModel(
    private val repository: CourseRepository = CourseRepository()
) : ViewModel() {

    val courses: List<Course> = repository.getCourses()

    fun getCourseById(id: Int): Course? = repository.getCourseById(id)
}
