package com.example.eventapp

interface OnTaskItemClicked {
    fun onEditClicked(routine: RoutineModel)

    fun onDeleteClicked(routine: RoutineModel)
}