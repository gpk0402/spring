package com.epam.designprinciples.lsp;

public class IPod extends MusicPlayer{

	@Override
	public void playMusic(String fileName) {
		System.out.println("Playing music..."+fileName);
	}

}
