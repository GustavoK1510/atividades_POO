import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plataforma plataforma = new Plataforma();

        plataforma.cadastrarMusica(new Musica("Destaque", "Brandão", 354));
        plataforma.cadastrarMusica(new Musica("Musica Teste", "Artista Teste", 65));
        plataforma.cadastrarMusica(new Musica("Outra Faixa", "Outro Artista", 600));

        int opcao;

        do {
            System.out.println();
            System.out.println("=== Sonora ===");
            System.out.println("1 - Cadastrar música manualmente");
            System.out.println("2 - Cadastrar usuário");
            System.out.println("3 - Criar playlist e adicionar músicas");
            System.out.println("4 - Buscar música por id");
            System.out.println("5 - Buscar música por título");
            System.out.println("6 - Reproduzir uma música");
            System.out.println("7 - Listar acervo");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Digite uma opção numérica.");
                opcao = -1;
                continue;
            }

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarMusica(scanner, plataforma);
                    break;
                case 2:
                    cadastrarUsuario(scanner, plataforma);
                    break;
                case 3:
                    criarPlaylist(scanner, plataforma);
                    break;
                case 4:
                    buscarPorId(scanner, plataforma);
                    break;
                case 5:
                    buscarPorTitulo(scanner, plataforma);
                    break;
                case 6:
                    reproduzirMusica(scanner, plataforma);
                    break;
                case 7:
                    listarAcervo(plataforma);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarMusica(Scanner scanner, Plataforma plataforma) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Artista: ");
        String artista = scanner.nextLine();

        System.out.print("Duração em segundos: ");
        int duracao = lerInteiro(scanner);

        Musica musica = new Musica(titulo, artista, duracao);

        if (plataforma.cadastrarMusica(musica)) {
            System.out.println("Música cadastrada com ID " + musica.getId() + ".");
        } else {
            System.out.println("Não foi possível cadastrar a música.");
        }
    }

    private static void cadastrarUsuario(Scanner scanner, Plataforma plataforma) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        Usuario usuario = new Usuario(nome, email);

        if (plataforma.cadastrarUsuario(usuario)) {
            System.out.println("Usuário cadastrado com ID " + usuario.getId() + ".");
        } else {
            System.out.println("Não foi possível cadastrar o usuário.");
        }
    }

    private static void criarPlaylist(Scanner scanner, Plataforma plataforma) {
        if (plataforma.getTotalUsuarios() == 0) {
            System.out.println("Cadastre um usuário primeiro.");
            return;
        }

        if (plataforma.getTotalMusicas() == 0) {
            System.out.println("Cadastre uma música primeiro.");
            return;
        }

        System.out.print("ID do usuário dono: ");
        int idUsuario = lerInteiro(scanner);

        Usuario dono = null;

        for (int i = 1; i <= plataforma.getTotalUsuarios(); i++) {
            Usuario usuario = plataforma.getUsuarioNaPosicao(i - 1);
            if (usuario != null && usuario.getId() == idUsuario) {
                dono = usuario;
                break;
            }
        }

        if (dono == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        System.out.print("Nome da playlist: ");
        String nome = scanner.nextLine();

        Playlist playlist = new Playlist(nome, dono);

        System.out.println("Digite os IDs das músicas para adicionar. Digite 0 para terminar.");

        while (true) {
            System.out.print("ID da música: ");
            int idMusica = lerInteiro(scanner);

            if (idMusica == 0) {
                break;
            }

            Musica musica = plataforma.buscarMusicaPorId(idMusica);

            if (musica == null) {
                System.out.println("Música não encontrada.");
            } else if (playlist.adicionar(musica)) {
                System.out.println("Música adicionada.");
            } else {
                System.out.println("Não foi possível adicionar.");
            }
        }

        System.out.println("Playlist criada: " + playlist.getNome());
        System.out.println("Quantidade: " + playlist.getQuantidade());
        System.out.println("Duração total: " + playlist.getDuracaoTotalSegundos() + " segundos");
    }

    private static void buscarPorId(Scanner scanner, Plataforma plataforma) {
        System.out.print("ID da música: ");
        int id = lerInteiro(scanner);

        Musica musica = plataforma.buscarMusicaPorId(id);

        if (musica == null) {
            System.out.println("Música não encontrada.");
        } else {
            System.out.println(musica);
        }
    }

    private static void buscarPorTitulo(Scanner scanner, Plataforma plataforma) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        Musica musica = plataforma.buscarMusica(titulo);

        if (musica == null) {
            System.out.println("Música não encontrada.");
        } else {
            System.out.println(musica);
        }
    }

    private static void reproduzirMusica(Scanner scanner, Plataforma plataforma) {
        System.out.print("ID da música: ");
        int id = lerInteiro(scanner);

        Musica musica = plataforma.buscarMusicaPorId(id);

        if (musica == null) {
            System.out.println("Música não encontrada.");
            return;
        }

        musica.reproduzir();
        System.out.println("Reproduções: " + musica.getReproducoes());
    }

    private static void listarAcervo(Plataforma plataforma) {
        if (plataforma.getTotalMusicas() == 0) {
            System.out.println("Acervo vazio.");
            return;
        }

        for (int i = 0; i < plataforma.getTotalMusicas(); i++) {
            System.out.println(plataforma.getMusicaNaPosicao(i));
        }
    }

    private static int lerInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Digite um número inteiro: ");
        }

        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
}
