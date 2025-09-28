package com.ipartek.citas.accesodatos;

import com.ipartek.citas.entidades.Cita;

public interface DaoCita extends Dao<Cita> {
	Iterable<Cita> buscarPorTexto(String texto);
}
