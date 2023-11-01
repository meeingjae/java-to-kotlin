package com.javatokotlin.chapter14

sealed class BMW(val name: String, val price: Int)

class Series3 : BMW("3시리즈", 5000000)

class Series5 : BMW("5시리즈", 80000000)
