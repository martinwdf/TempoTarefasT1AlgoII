import java.io.*;

public class LerArquivoTeste {
    // variaveis
    private String nome;
    private String[] sai;
    RandomAccessFile objeto;
    private int tamanhoArquivo;

    // O contrutor deve ter o mesmo nome da Classe
    public LerArquivoTeste(String nomeArquivo) {
        nome = nomeArquivo;
        setTamanhoArquivo(0);
    }

    public int getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(int tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    // método que retorna o vetor contendo as informações do arquivo
    public String[] criarVetor() throws IOException {
        // tamanhoArquivo= 0;
        // File arquivoLeitura = new File(nome);
        // long tamanhoArquivo = arquivoLeitura .length();
	    // FileInputStream fs = new FileInputStream(arquivoLeitura);
        // DataInputStream in = new DataInputStream(fs);

            
        // LineNumberReader lineRead = new LineNumberReader(new InputStreamReader(in));
	    // lineRead.skip(tamanhoArquivo);
	    // // conta o numero de linhas do arquivo, começa com zero, por isso adiciona 1
        // tamanhoArquivo= lineRead.getLineNumber() + 1;
        // this.setTamanhoArquivo((int)tamanhoArquivo);
        try {
            File arq = new File(nome);
            objeto = new RandomAccessFile(arq, "rw");
            sai = new String[(int) objeto.length()]; // inicializa o vetor com o tamanho do arquivo
            for (int i = 0; i < objeto.length(); i++) {
                sai[i] = objeto.readLine();
                //System.out.println(sai[i]);
            }
            return sai;
        } catch (FileNotFoundException ex) { // trata as exceções do tipo FileNotFoundException
            ex.printStackTrace();
        } catch (IOException ex) { // trata as exceções do tipo IOException
            ex.printStackTrace();
        }
        return null; // só retorna null se der algum erro
    }
    
    public int tamanhoArquivo() throws IOException {
        tamanhoArquivo= 0;
        File arquivoLeitura = new File(nome);
        long tamanhoArquivo = arquivoLeitura .length();
	    FileInputStream fs = new FileInputStream(arquivoLeitura);
        DataInputStream in = new DataInputStream(fs);

            
        LineNumberReader lineRead = new LineNumberReader(new InputStreamReader(in));
	    lineRead.skip(tamanhoArquivo);
	    // conta o numero de linhas do arquivo, começa com zero, por isso adiciona 1
        tamanhoArquivo= lineRead.getLineNumber() + 1;
        lineRead.close();
        return (int)tamanhoArquivo;
        
    }
}

