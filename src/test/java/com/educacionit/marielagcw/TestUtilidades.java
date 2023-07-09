package com.educacionit.marielagcw;


import com.educacionit.marielagcw.utils.sistema.*;

public class TestUtilidades {
	public static void main(String[] args) {
		System.out.println(new Fecha().getFecha());
		System.out.println(new SistemaOperativo().getSistemaOperativo());
		System.out.println(new Ubicacion().getUbicacion());
		System.out.println(new Usuario().getUsuario());
		System.out.println(new VersionJava().getVersionJava());
	}
}
