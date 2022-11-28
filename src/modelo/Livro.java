package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Livro {

  private int idLivro;
  private String titulo;
  private int anoLancamento;
  private int numeroPaginas;
  private String resumo;
  private String idioma;
  private String paisOrigem;
  private Connection conexao;
  
  public Livro(){
    
  }
  
  public Livro(Connection conexao){
    this.conexao = conexao;
  }

  public int getIdLivro() {
    return idLivro;
  }

  public void setIdLivro(int idLivro) {
    this.idLivro = idLivro;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getAnoLancamento() {
    return anoLancamento;
  }

  public void setAnoLancamento(int anoLancamento) {
    this.anoLancamento = anoLancamento;
  }

  public int getNumeroPaginas() {
    return numeroPaginas;
  }

  public void setNumeroPaginas(int numeroPaginas) {
    this.numeroPaginas = numeroPaginas;
  }

  public String getResumo() {
    return resumo;
  }

  public void setResumo(String resumo) {
    this.resumo = resumo;
  }

  public String getIdioma() {
    return idioma;
  }

  public void setIdioma(String idioma) {
    this.idioma = idioma;
  }

  public String getPaisOrigem() {
    return paisOrigem;
  }

  public void setPaisOrigem(String paisOrigem) {
    this.paisOrigem = paisOrigem;
  }
  
  public ResultSet obterListaLivros() throws SQLException{
    String sql = "select * from livro";
    PreparedStatement requisicao = conexao.prepareStatement(sql);
    return requisicao.executeQuery();
  }
  
  public void incluiLivro() throws SQLException{
    String sql = "insert into livro(titulo, "
            + "anoLancamento, "
            + "numeroPaginas, "
            + "resumo, "
            + "idioma, "
            + "paisOrigem)"
            + " values(?, ?, ?, ?, ?, ?)";
    PreparedStatement requisicao = conexao.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
    requisicao.setString(1, titulo);
    requisicao.setInt(2, anoLancamento);
    requisicao.setInt(3, numeroPaginas);
    requisicao.setString(4, resumo);
    requisicao.setString(5, idioma);
    requisicao.setString(6, paisOrigem);
    requisicao.execute();
    //Obtendo o id
    ResultSet resultado = requisicao.getGeneratedKeys();
    if(resultado.next()){
      idLivro = resultado.getInt(1);
    }
  }
  
  public void atualizaLivro() throws SQLException{
    String sql = "update livro set titulo=?, "
            + "anoLancamento=?, "
            + "numeroPaginas=?, "
            + "resumo=?, "
            + "idioma=?, "
            + "paisOrigem=? where idLivro=?";
    PreparedStatement requisicao = conexao.prepareStatement(sql);
    requisicao.setString(1, titulo);
    requisicao.setInt(2, anoLancamento);
    requisicao.setInt(3, numeroPaginas);
    requisicao.setString(4, resumo);
    requisicao.setString(5, idioma);
    requisicao.setString(6, paisOrigem);
    requisicao.setInt(7, idLivro);
    requisicao.executeUpdate();
  }
  
  public void deletaLivro() throws SQLException{
    String sql = "delete from livro where idLivro=?";
    PreparedStatement requisicao = conexao.prepareStatement(sql);
    requisicao.setInt(1, idLivro);
    requisicao.execute();
  }
  
  public void deletaLivro(int idLivro) throws SQLException{
    String sql = "delete from livro where idLivro=?";
    PreparedStatement requisicao = conexao.prepareStatement(sql);
    requisicao.setInt(1, idLivro);
    requisicao.execute();
  }
  
  public boolean obterLivroPeloIdLivro(int idLivro) throws SQLException{
    String sql = "select * from livro where idLivro=?";

    PreparedStatement requisicao = conexao.prepareStatement(sql);
    requisicao.setInt(1, idLivro);
    ResultSet resultado = requisicao.executeQuery();
    if(resultado.next()){
      this.idLivro = idLivro;
      titulo = resultado.getString("titulo");
      anoLancamento = resultado.getInt("anoLancamento");
      numeroPaginas = resultado.getInt("numeroPaginas");
      resumo = resultado.getString("resumo");
      idioma = resultado.getString("idioma");
      paisOrigem = resultado.getString("paisOrigem");
      return true;
    }
    return false;
  }
  
  public boolean obterLivroMenorId() throws SQLException{
    String sql = "select * from livro order by idLivro asc limit 1";

    PreparedStatement requisicao = conexao.prepareStatement(sql);
    requisicao.execute();
    ResultSet resultado = requisicao.executeQuery();
    if(resultado.next()){
      idLivro = resultado.getInt("idLivro");
      titulo = resultado.getString("titulo");
      anoLancamento = resultado.getInt("anoLancamento");
      numeroPaginas = resultado.getInt("numeroPaginas");
      resumo = resultado.getString("resumo");
      idioma = resultado.getString("idioma");
      paisOrigem = resultado.getString("paisOrigem");
      return true;
    }
    return false;
  }
  
  public boolean obterLivroMaiorId() throws SQLException{
    String sql = "select * from livro order by idLivro desc limit 1";

    PreparedStatement requisicao = conexao.prepareStatement(sql);
    requisicao.execute();
    ResultSet resultado = requisicao.executeQuery();
    if(resultado.next()){
      idLivro = resultado.getInt("idLivro");
      titulo = resultado.getString("titulo");
      anoLancamento = resultado.getInt("anoLancamento");
      numeroPaginas = resultado.getInt("numeroPaginas");
      resumo = resultado.getString("resumo");
      idioma = resultado.getString("idioma");
      paisOrigem = resultado.getString("paisOrigem");
      return true;
    }
    return false;
  }
  
  
  
  
}
