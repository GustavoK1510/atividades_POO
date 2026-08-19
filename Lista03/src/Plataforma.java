public class Plataforma {
    private static final int CAPACIDADE = 500;

    private Musica[] musicas;
    private Usuario[] usuarios;
    private int totalMusicas;
    private int totalUsuarios;

    public Plataforma() {
        musicas = new Musica[CAPACIDADE];
        usuarios = new Usuario[CAPACIDADE];
        totalMusicas = 0;
        totalUsuarios = 0;
    }

    public boolean cadastrarMusica(Musica musica) {
        if (musica == null || totalMusicas >= CAPACIDADE) {
            return false;
        }

        musicas[totalMusicas] = musica;
        totalMusicas++;
        return true;
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        if (usuario == null || totalUsuarios >= CAPACIDADE) {
            return false;
        }

        usuarios[totalUsuarios] = usuario;
        totalUsuarios++;
        return true;
    }

    public Musica buscarMusicaPorId(int id) {
        for (int i = 0; i < totalMusicas; i++) {
            if (musicas[i].getId() == id) {
                return musicas[i];
            }
        }

        return null;
    }

    public Musica buscarMusica(String titulo) {
        if (titulo == null) {
            return null;
        }

        for (int i = 0; i < totalMusicas; i++) {
            if (musicas[i].getTitulo().equals(titulo)) {
                return musicas[i];
            }
        }

        return null;
    }

    public int getTotalMusicas() {
        return totalMusicas;
    }

    public int getTotalUsuarios() {
        return totalUsuarios;
    }

    public Usuario getUsuarioNaPosicao(int indice) {
        if (indice < 0 || indice >= totalUsuarios) {
            return null;
        }

        return usuarios[indice];
    }

    public Musica getMusicaNaPosicao(int indice) {
        if (indice < 0 || indice >= totalMusicas) {
            return null;
        }

        return musicas[indice];
    }
}
