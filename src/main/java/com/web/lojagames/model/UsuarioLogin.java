package com.web.lojagames.model;


public class UsuarioLogin {

    private Long id;
    private String nome;
    private String usuario;
    private String senha;
    private String foto;
    private String token;

    public Long getId() {
        return id;
    }

    public UsuarioLogin setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public UsuarioLogin setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getUsuario() {
        return usuario;
    }

    public UsuarioLogin setUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public UsuarioLogin setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public String getFoto() {
        return foto;
    }

    public UsuarioLogin setFoto(String foto) {
        this.foto = foto;
        return this;
    }

    public String getToken() {
        return token;
    }

    public UsuarioLogin setToken(String token) {
        this.token = token;
        return this;
    }
}
