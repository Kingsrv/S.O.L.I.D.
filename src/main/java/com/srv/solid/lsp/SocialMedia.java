package com.srv.solid.lsp;

public abstract class SocialMedia {

    public abstract void chatWithFriends();
    public abstract void publishPost(Object post);
    public abstract void sendPhotosAndVideos();
    public abstract void groupVideoCall(String... users);
}
