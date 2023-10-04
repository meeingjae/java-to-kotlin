package com.advanced.chapter1

abstract class Animal(name: String)

abstract class Fish(name: String) : Animal(name)

class GoldFish(name: String) : Fish(name)

class RedFish(name: String) : Fish(name)
