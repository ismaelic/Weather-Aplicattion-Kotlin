package com.example.kotlinweather.Model

class OpenWeatherMap{

    var coord:Coord?=null
    var weather:List<Weather>?=null
    var base:String?=null
    var main:Main?=null
    var clouds:Clouds?=null
    var wind:Wind?=null
    var rain:Rain?=null
    var dt:Int=0
    var sys:Sys?=null
    var id:Int=0
    var name:String?=null
    var cod:Int=0

    constructor(){}

    constructor(coord: Coord,weatherList: List<Weather>,base:String,main: Main,clouds: Clouds,wind: Wind,rain: Rain,dt:Int,sys: Sys,id:Int,name:String,cod:Int)
    {
        this.coord=coord;
        this.weather=weatherList
        this.base=base
        this.main=main
        this.clouds=clouds
        this.wind=wind
        this.rain=rain
        this.dt=dt
        this.sys=sys
        this.id=id
        this.name=name
        this.cod=cod
    }

}