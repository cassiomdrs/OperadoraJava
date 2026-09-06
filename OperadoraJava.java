public class OperadoraJava {
    void main () {
        int iniciar = 1;
        
        menuPrincipal:
        do {
            iniciar = 1;
            IO.println("Bem vindo à Operadora Java!\nComo podemos te ajudar?\n");

            IO.println("Digite 1 para Planos/Assinaturas.");
            IO.println("Digite 2 para Segunda via de contas.");
            IO.println("Digite 3 para Pedido de instalação.");
            IO.println("Digite 4 para Suporte técnico.");

            int opcao = Integer.parseInt(IO.readln("\nEscolha uma opção: "));

            switch (opcao) {
                case 1:
                    IO.println("\nPlanos/Assinaturas:\n");
                    IO.println("Digite 1 300MB de Internet.");
                    IO.println("Digite 2 500MB de Internet.");
                    IO.println("Digite 3 700MB de Internet.");
                    IO.println("Digite 4 1GB de Internet + Séries e Filmes.");
                    int opcaoPA = Integer.parseInt(IO.readln("\nQual plano é o ideal para você? "));

                    switch (opcaoPA) {
                        case 1:
                            IO.println("\n300MB de Internet SELECIONADO;");
                            IO.println("Por: R$ 49,90");
                            IO.println("Deseja confirmar essa assinatura?");

                            int confirmar1 = Integer.parseInt(IO.readln("\nDigite 1 para SIM ou Digite 2 para NÃO: "));

                            switch (confirmar1) {
                                case 1:
                                    IO.println("\nParabéns, seu plano de 300MB de Internet foi confirmado com sucesso!");
                                    break;
                            
                                case 2:
                                    IO.println("\nQue pena que você não confirmou esse plano, mas fique a vontade para falar conosco novamente.");
                                    break;

                                default:
                                    IO.println("Desculpe, essa opção não existe!");
                                    iniciar = Integer.parseInt(IO.readln("Digite 0 para voltar ao menu principal ou qualquer número para encerrar: "));
                                    break;
                            }
                            break;
                        case 2:
                            IO.println("\n500MB de Internet SELECIONADO;");
                            IO.println("Por: R$ 69,90");
                            IO.println("Deseja confirmar essa assinatura?");

                            int confirmar2 = Integer.parseInt(IO.readln("\nDigite 1 para SIM ou Digite 2 para NÃO: "));

                            switch (confirmar2) {
                                case 1:
                                    IO.println("\nParabéns, seu plano de 500MB de Internet foi confirmado com sucesso!");
                                    break;
                            
                                case 2:
                                    IO.println("\nQue pena que você não confirmou esse plano, mas fique a vontade para falar conosco novamente.");
                                    break;

                                default:
                                    IO.println("Desculpe, essa opção não existe!");
                                    iniciar = Integer.parseInt(IO.readln("Digite 0 para voltar ao menu principal ou qualquer número para encerrar: "));
                                    break;
                            }
                            break;
                        case 3:
                            IO.println("\n700MB de Internet SELECIONADO;");
                            IO.println("Por: R$ 89,90");
                            IO.println("Deseja confirmar essa assinatura?");

                            int confirmar3 = Integer.parseInt(IO.readln("\nDigite 1 para SIM ou Digite 2 para NÃO: "));

                            switch (confirmar3) {
                                case 1:
                                    IO.println("\nParabéns, seu plano de 700MB de Internet foi confirmado com sucesso!");
                                    break;
                            
                                case 2:
                                    IO.println("\nQue pena que você não confirmou esse plano, mas fique a vontade para falar conosco novamente.");
                                    break;

                                default:
                                    IO.println("Desculpe, essa opção não existe!");
                                    iniciar = Integer.parseInt(IO.readln("Digite 0 para voltar ao menu principal ou qualquer número para encerrar: "));
                                    break;
                            }
                            break;
                        case 4:
                            IO.println("\n1GB de Internet + Séries e Filmes SELECIONADO;");
                            IO.println("Por: R$ 149,90");
                            IO.println("Deseja confirmar essa assinatura?");

                            int confirmar4 = Integer.parseInt(IO.readln("\nDigite 1 para SIM ou Digite 2 para NÃO: "));

                            switch (confirmar4) {
                                case 1:
                                    IO.println("\nParabéns, seu plano de 1GB de Internet + Séries e Filmes foi confirmado com sucesso!");
                                    break;
                            
                                case 2:
                                    IO.println("\nQue pena que você não confirmou esse plano, mas fique a vontade para falar conosco novamente.");
                                    break;

                                default:
                                    IO.println("Desculpe, essa opção não existe!");
                                    iniciar = Integer.parseInt(IO.readln("Digite 0 para voltar ao menu principal ou qualquer número para encerrar: "));
                                    break;
                            }
                            break;
                    
                        default:
                            IO.println("Desculpe, essa opção não existe!");
                            iniciar = Integer.parseInt(IO.readln("Digite 0 para voltar ao menu principal ou qualquer número para encerrar: "));
                            break;
                    }

                    break;
                case 2:
                    IO.println("\nSegunda via de contas\n");
                    String cpf = IO.readln("Digite o número de inscrição ou o CPF do titular da conta (apenas números): ");

                    switch (cpf) {
                        case "1234567890","0026":
                            IO.println("\nFatura: 15/08/2026 (Pendente de pagamento)");
                            IO.println("Deseja receber a segunda via por e-mail?");
                            int cpfConfirm = Integer.parseInt(IO.readln("\nDigite 1 para SIM ou Digite 2 para NÃO: "));

                            switch (cpfConfirm) {
                                case 1:
                                    IO.println("\nSegunda via de conta enviada seu e-mail, verifique sua caixa de entrada e efetue o pagamento.");
                                    break;
                                
                                case 2:
                                    IO.println("\nCerto. As ligações de cobranças serão constantes, efetue o pagamento o mais breve possível.");
                                    break;
                            
                                default:
                                    IO.println("Desculpe, essa opção não existe!");
                                    iniciar = Integer.parseInt(IO.readln("Digite 0 para voltar ao menu principal ou qualquer número para encerrar: "));
                                    break;
                            }
                            break;
                    
                        default:
                            IO.println("Descupe, número de inscrição ou CPF não encontrado!");
                            iniciar = Integer.parseInt(IO.readln("Digite 0 para voltar ao menu principal ou qualquer número para encerrar: "));
                            break;
                    }
                    break;
                case 3:
                    IO.println("\nPedido de instalação\n");
                    String opcaoPedido = IO.readln("Digite número do pedido ou CPF do titular (apenas números): ");
                    
                    switch (opcaoPedido) {
                        case "1234567890", "0026":
                            IO.println("\nLocalizamos sua solicitação!\nO técnico está acaminho para realizar a instalação.\nAguarde dentro do horário comercial (8h às 18h) que o técnico irá lhe atender.");
                        break;
                    
                        default:
                            IO.println("Número do pedido ou CPF inválido!\nSolicitação de instalação não encontrada!");
                            iniciar = Integer.parseInt(IO.readln("Digite 0 para voltar ao menu principal ou qualquer número para encerrar: "));
                        break;
                    }
                    break;
                case 4:
                    IO.println("\nSuporte técnico\n");
                    IO.println("Digite 1 Internet lenta.");
                    IO.println("Digite 2 Falta internet.");
                    IO.println("Digite 3 Não abre site específico.");
                    IO.println("Digite 4 Jogo com latência alta.");
                    IO.println("Digite 5 Agendamento de visita técnica.");
                    int opcaoST = Integer.parseInt(IO.readln("\nQual problema você está enfrentando? "));

                    switch (opcaoST) {
                        case 1:
                            IO.println("\nVocê selecionou: Internet lenta.");
                            IO.println("Reinicie o modem e verifique se a velocidade da internet melhora.");
                            IO.println("Se o problema persistir, entre em contato com nosso suporte técnico e agende uma visita.");
                            break;
                        case 2:
                            IO.println("\nVocê selecionou: Falta internet.");
                            IO.println("Verifique se o modem está conectado e se há sinal de internet.\nA luz verde deve estar acesa. Caso não esteja, reinicie o modem e aguarde alguns minutos.");
                            IO.println("Se o problema persistir, entre em contato com nosso suporte técnico e agende uma visita.");
                            break;
                        case 3:
                            IO.println("\nVocê selecionou: Não abre site específico.");
                            IO.println("Tente limpar o cache do navegador e verificar se o problema persiste.");
                            IO.println("Se o problema persistir, entre em contato com nosso suporte técnico e agende uma visita.");
                            break;
                        case 4:
                            IO.println("\nVocê selecionou: Jogo com latência alta.");
                            IO.println("Verifique se o jogo está atualizado e se há problemas com o servidor.");
                            IO.println("Se o problema persistir, entre em contato com nosso suporte técnico e agende uma visita.");
                            break;
                        case 5:
                            IO.println("\nVocê selecionou: Agendamento de visita técnica.");
                            String agendamentoOpcao = IO.readln("Digite número de inscrição ou CPF do titular (apenas números): ");

                            switch (agendamentoOpcao) {
                                case "1234567890", "0026":
                                    IO.println("\nLocalizamos seu cadastro! ");
                                    IO.println("\nTemos vagas nos seguintes dias:");
                                    IO.println("Digite 1 para Segunda-feira.");
                                    IO.println("Digite 2 para Quarta-feira.");
                                    IO.println("Digite 3 para Sexta-feira.");

                                    int agendamentoDiaOpcao = Integer.parseInt(IO.readln("\nQual o melhor dia para você? "));
                                    String agendamentoDia = "";
                                    
                                    switch (agendamentoDiaOpcao) {
                                        case 1:
                                            agendamentoDia = "Segunda-feira";
                                            break;
                                    
                                        case 2:
                                             agendamentoDia = "Quarta-feira";
                                            break;
                                    
                                        case 3:
                                            agendamentoDia = "Sexta-feira";
                                            break;
                                    
                                        default:
                                            IO.println("Dia inválido!");
                                            iniciar = Integer.parseInt(IO.readln("Digite 0 para voltar ao menu principal ou qualquer número para encerrar: "));
                                            continue menuPrincipal;
                                    }

                                    IO.println("\nTemos seguintes horários disponíveis:");
                                    IO.println("Digite 1 para 09:00h.");
                                    IO.println("Digite 2 para 11:00h.");
                                    IO.println("Digite 3 para 14:00h.");
                                    IO.println("Digite 4 para 16:00h.");

                                    int agendamentoHorarioOpcao = Integer.parseInt(IO.readln("\nQual o melhor horário para você? "));
                                    String agendamentoHorario = "";

                                    switch (agendamentoHorarioOpcao) {
                                        case 1:
                                            agendamentoHorario = "09:00h";
                                            break;
                                    
                                        case 2:
                                             agendamentoHorario = "11:00h";
                                            break;
                                    
                                        case 3:
                                            agendamentoHorario = "14:00h";
                                            break;
                                    
                                        case 4:
                                            agendamentoHorario = "16:00h";
                                            break;
                                    
                                        default:
                                            IO.println("Horário inválido!");
                                            iniciar = Integer.parseInt(IO.readln("Digite 0 para voltar ao menu principal ou qualquer número para encerrar: "));
                                            continue menuPrincipal;
                                    }
                                
                                    IO.println("\nAgendamento realizado com sucesso!\nDia: " + agendamentoDia + "\nHorário: " + agendamentoHorario);
                                    IO.println("O técnico Javalino entrará em contato com você para confirmar os detalhes do agendamento.");
                                    break;

                                default:
                                    IO.println("Número de incrição ou CPF inválido!");
                                    iniciar = Integer.parseInt(IO.readln("Digite 0 para voltar ao menu principal ou qualquer número para encerrar: "));
                                    break;
                            }
                            break;

                        default:
                            IO.println("Desculpe, essa opção não existe!");
                            iniciar = Integer.parseInt(IO.readln("Digite 0 para voltar ao menu principal ou qualquer número para encerrar: "));
                            break;
                    }
                    break;
                default:
                    IO.println("Desculpe, essa opção não existe!");
                    iniciar = Integer.parseInt(IO.readln("Digite 0 para voltar ao menu principal ou qualquer número para encerrar: "));
                    break;
            }
        } while (iniciar == 0);

        IO.println("A Operadora Java está sempre à disposição! Agradecemos seu contato!");
    }
}