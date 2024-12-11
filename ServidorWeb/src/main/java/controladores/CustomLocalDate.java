/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;


import jakarta.xml.bind.annotation.XmlElement;

/**
 *
 * @author dokgo
 */
public class CustomLocalDate extends com.servicios.LocalDate {
    
    @XmlElement(name = "year")
    private int year;

    @XmlElement(name = "month")
    private int month;

    @XmlElement(name = "day")
    private int day;

    // Constructor vacío
    public CustomLocalDate() {
    }

    // Constructor con parámetros
    public CustomLocalDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getters y setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // Métodos de conversión
    public java.time.LocalDate toLocalDate() {
        return java.time.LocalDate.of(year, month, day);
    }

    public static CustomLocalDate fromLocalDate(java.time.LocalDate localDate) {
        return new CustomLocalDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
    }
    
    public String toFormattedString() {
        return String.format("%04d-%02d-%02d", this.year, this.month, this.day);
    }
}
