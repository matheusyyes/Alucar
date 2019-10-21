/*
 * package br.com.alucar.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.RequestMapping;
 * 
 * import br.com.alucar.Dao.CarroDao; import br.com.alucar.modelo.Fabricante;
 * 
 * @Controller public class CadastroCarroController {
 * 
 * @Autowired CarroDao carrodao = new CarroDao();
 * 
 * 
 * @RequestMapping() public String cadCarro (Model model) {
 * 
 * List <Fabricante> fabricante; fabricante = carrodao.fabricante();
 * model.addAttribute("fabricantes",fabricante); return "fabricante";
 * 
 * }
 * 
 * }
 */