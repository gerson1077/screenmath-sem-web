package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.Convertedados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoApi consumoApi = new ConsumoApi();

		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=32edef49");
		System.out.println(json);

//		json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
//		System.out.println(json);

		Convertedados conversor = new Convertedados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);



	}
}
