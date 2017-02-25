package com.trabajo4.agendaunp;


public class Personas {

    private int _id;
    private String _nombre;
    private String _apellido;

    private String _telefono;
    private String _email;


    public Personas(){
        //Constructor Vacio
    }
    public Personas(String nombre, String apellido, String telefono, String email) {
        this._nombre = nombre;
        this._apellido = apellido;

        this._telefono = telefono;
        this._email = email;

    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_nombre() {
        return _nombre;
    }

    public void set_nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String get_apellido() {
        return _apellido;
    }

    public void set_apellido(String _apellido) {
        this._apellido = _apellido;
    }





    public String get_telefono() {
        return _telefono;
    }

    public void set_telefono(String _telefono) {
        this._telefono = _telefono;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    }
