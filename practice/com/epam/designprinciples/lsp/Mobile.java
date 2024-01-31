package com.epam.designprinciples.lsp;

public abstract class Mobile extends MusicPlayer{
	public abstract void sendSMS();
	public abstract void call();
	public abstract void playVideo(String fileName);

}
