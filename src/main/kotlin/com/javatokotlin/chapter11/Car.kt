package com.javatokotlin.chapter11

open class Car(
    internal val name: String,
    protected val wheels: Int,
    _price: String
) {
    var price: String = _price
        public get
        private set
}