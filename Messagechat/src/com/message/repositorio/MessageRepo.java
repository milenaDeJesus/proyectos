package com.message.repositorio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Mensaje;
import com.message.dominio.Usuario;

public class MessageRepo {
	
	private List<Mensaje> mensajes = new ArrayList<Mensaje>();
	private UserRepo usuario = new UserRepo();
	
	public MessageRepo() {
		Usuario berenice = usuario.userId(1);
		Usuario alexis = usuario.userId(2);
		Usuario melanie = usuario.userId(3);
		Usuario alisson = usuario.userId(4);
		Usuario pedro = usuario.userId(5);
		
		//CONVERSACIONES DE BERENICE//
		mensajes.add(new Mensaje(1, alexis, berenice, LocalDateTime.of(2022, 02, 10, 9, 23), "Hola, que tal?"));
		mensajes.add(new Mensaje(2, berenice, alexis, LocalDateTime.of(2022, 02, 10, 9, 23), "Todo bien Alexis y tu como estas?"));
				
		mensajes.add(new Mensaje(3, berenice, alisson, LocalDateTime.of(2022, 02, 10, 9, 23), "Hola Alisson, ya estudiate para la leccion?"));
		mensajes.add(new Mensaje(4, alisson, berenice, LocalDateTime.of(2022, 02, 10, 9, 23), "Siii, pase todo el dia estudiando"));
				
		mensajes.add(new Mensaje(5, berenice, alexis, LocalDateTime.of(2022, 02, 10, 9, 23), "Alexis pasame las fotos del evento del jueves"));
		mensajes.add(new Mensaje(6, alexis, berenice, LocalDateTime.of(2022, 02, 10, 9, 23), "Yo no tengo las fotos, ya le digo a Mel que te pase"));
			
		mensajes.add(new Mensaje(7, melanie, berenice, LocalDateTime.of(2022, 02, 10, 9, 23), "Hola Bere, Alexis me pidio que te pase las fotos del evento"));
		mensajes.add(new Mensaje(8, berenice, melanie, LocalDateTime.of(2022, 02, 10, 9, 23), "Siii, porfa"));
				
		//CONVERSACIONES DE ALEXIS//
		mensajes.add(new Mensaje(18, alexis, alisson, LocalDateTime.of(2022, 02, 10, 9, 23), "Hola, como te ha va? cuando regresas a la facultad?"));
		mensajes.add(new Mensaje(19, alisson, alexis, LocalDateTime.of(2022, 02, 10, 9, 23), "Holiiiis, yo creo que el viernes regreso"));
				
		mensajes.add(new Mensaje(20, alexis, alisson, LocalDateTime.of(2022, 02, 10, 9, 23), "Listo, te esperamos"));
		mensajes.add(new Mensaje(21, alisson, alexis, LocalDateTime.of(2022, 02, 10, 9, 23), "Pasa los deberes para poder igualarme :("));
			
		mensajes.add(new Mensaje(22, berenice, alexis, LocalDateTime.of(2022, 02, 10, 9, 23), "Hablaste con Alisson?"));
		mensajes.add(new Mensaje(23, alexis, berenice, LocalDateTime.of(2022, 02, 10, 9, 23), "Si, me comento que regresa el viernes"));
				
		mensajes.add(new Mensaje(24, alexis, melanie, LocalDateTime.of(2022, 02, 10, 9, 23), "Hola Mel, tienes analisis?"));
		mensajes.add(new Mensaje(25, melanie, alexis, LocalDateTime.of(2022, 02, 10, 9, 23), "jajajajajajj si tengo, ya te paso"));
				
		//CONVERSACIONES DE MELANIE//
		mensajes.add(new Mensaje(34, melanie, alisson, LocalDateTime.of(2022, 02, 10, 9, 23), "Holaaa, ya me entere que regresas el viernes"));
		mensajes.add(new Mensaje(35, alisson, melanie, LocalDateTime.of(2022, 02, 10, 9, 23), "Siiiii, estoy ansiosa por verlos"));
				
		mensajes.add(new Mensaje(36, berenice, melanie, LocalDateTime.of(2022, 02, 10, 9, 23), "Mell, mañana a que hora sales de la facultad?"));
		mensajes.add(new Mensaje(37, melanie, berenice, LocalDateTime.of(2022, 02, 10, 9, 23), "Deja veo mi horario"));
			
		mensajes.add(new Mensaje(38, melanie, pedro, LocalDateTime.of(2022, 02, 10, 9, 23), "Que tal Pedro, te queria dar la bienvennida a nuestra facultad"));
		mensajes.add(new Mensaje(39, pedro, melanie, LocalDateTime.of(2022, 02, 10, 9, 23), "Hola, muchas gracias, espero llevarme bien con todos"));
				
		mensajes.add(new Mensaje(40, melanie, pedro, LocalDateTime.of(2022, 02, 10, 9, 23), "Holis amigoo, que tal te a ido?"));
		mensajes.add(new Mensaje(41, pedro, melanie, LocalDateTime.of(2022, 02, 10, 9, 23), "Hola, me a ido bien, ya conozco a casi todo el curso"));
				
		//CONVERSACIONES DE ALISSON//
		mensajes.add(new Mensaje(48, pedro, alisson, LocalDateTime.of(2022, 02, 10, 9, 23), "Hola Alisson, soy Pedro"));
		mensajes.add(new Mensaje(49, alisson, pedro, LocalDateTime.of(2022, 02, 10, 9, 23), "Hola Pedro, tu eres el compañero nuevo?"));
				
		mensajes.add(new Mensaje(50, alisson, pedro, LocalDateTime.of(2022, 02, 10, 9, 23), "Espero que mañana pueda darte el recorrido por la facultad"));
		mensajes.add(new Mensaje(51, pedro, alisson, LocalDateTime.of(2022, 02, 10, 9, 23), "Claro, no te preocupes, me comentaron que estas enferma"));
			
		mensajes.add(new Mensaje(52, alisson, pedro, LocalDateTime.of(2022, 02, 10, 9, 23), "Si, me encuentro muy mal"));
		mensajes.add(new Mensaje(53, pedro, alisson, LocalDateTime.of(2022, 02, 10, 9, 23), "Espero que te mejores pronto"));
				
		mensajes.add(new Mensaje(54, pedro, alisson, LocalDateTime.of(2022, 02, 10, 9, 23), "Cuidate"));
		mensajes.add(new Mensaje(55, alisson, pedro, LocalDateTime.of(2022, 02, 10, 9, 23), "Gracias por las buenas vibras, el viernes nos vemos"));
				
		//CONVERSACIONES DE PEDRO//
		mensajes.add(new Mensaje(60, pedro, melanie, LocalDateTime.of(2022, 02, 10, 9, 23), "Hola Mel, como vas con el deber de programacion?"));
		mensajes.add(new Mensaje(61, melanie, pedro, LocalDateTime.of(2022, 02, 10, 9, 23), "Ya esta casi listo, esta un poco complicado"));
				
		mensajes.add(new Mensaje(62, pedro, alexis, LocalDateTime.of(2022, 02, 10, 9, 23), "Que fue brother confirma"));
		mensajes.add(new Mensaje(63, alexis, pedro, LocalDateTime.of(2022, 02, 10, 9, 23), "Nada loco, estoy a full"));
				
		mensajes.add(new Mensaje(64, alexis, pedro, LocalDateTime.of(2022, 02, 10, 9, 23), "Mañana caigo de una"));
		mensajes.add(new Mensaje(65, pedro, alexis, LocalDateTime.of(2022, 02, 10, 9, 23), "Dale loco, pilas ese peloteo"));
				
		mensajes.add(new Mensaje(66, pedro, alexis, LocalDateTime.of(2022, 02, 10, 9, 23), "Que fue brother, vas a venir?"));
		mensajes.add(new Mensaje(67, alexis, pedro, LocalDateTime.of(2022, 02, 10, 9, 23), "Smn loco, ya estoy llegando"));
				
		mensajes.add(new Mensaje(68, berenice, pedro, LocalDateTime.of(2022, 02, 10, 9, 23), "Que mas Pedro?"));
		mensajes.add(new Mensaje(69, pedro, berenice, LocalDateTime.of(2022, 02, 10, 9, 23), "Aqui jugando pelota con los muchachos y tu Bere?"));
				
			}
	
	public List<Mensaje> getMensajes(){
		return mensajes;
	}
	
	public List<Mensaje> conversaciones(int usuario1, int usuario2) {
		List<Mensaje> resultado = new ArrayList<Mensaje>();
		for(Mensaje msj: mensajes) {
			if((msj.getUsuario1().getId() == usuario1 && msj.getUsuario2().getId() == usuario2) || (
					msj.getUsuario1().getId() == usuario2 && msj.getUsuario2().getId() == usuario1))
				resultado.add(msj);
		}
		return resultado;		
	}
	
	public Mensaje getUltimoMsj(int usuario1, int usuario2) {
		List<Mensaje> resultado = conversaciones(usuario1, usuario2);
		
		if(resultado.size() == 0)
			return null;
		return resultado.get(resultado.size()-1);		
	}
	
	public void addMensajes(Mensaje mensaje) {
		mensajes.add(mensaje);		
	}

}
