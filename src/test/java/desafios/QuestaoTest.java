package desafios;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class QuestaoTest {
	
	Questao questao = new Questao();

	@Test
	public void questaoUmTest() {
		int[] arr = {9, 2, 1, 4, 6};
		
		assertEquals(4, questao.questaoUm(arr));
	}
	
	@Test
	public void questaoDoisTest() {
		int[] n = {1, 5, 3, 4, 2};
		
		assertEquals(3, questao.questaoDois(n));
	}
	
	@Test
	public void questaoTresTest() {
		String frase = "tenha um bom dia";
		String outraFrase = "ola mundo";
		
		assertEquals("taoa eum nmd hbi", questao.questaoTres(frase));
		assertEquals("omd luo an", questao.questaoTres(outraFrase));
		
		assertEquals("", questao.questaoTres(""));
	}

}
