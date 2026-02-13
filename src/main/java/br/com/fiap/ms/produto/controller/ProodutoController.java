package br.com.fiap.ms.produto.controller;

import br.com.fiap.ms.produto.dto.ProdutoInputDTO;
import br.com.fiap.ms.produto.dto.ProdutoResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProodutoController {

//    @GetMapping
//    public ResponseEntity<List<ProdutoResponseDTO>> getProduto() {
//        //mockando dados para teste
//        List <ProdutoResponseDTO> dto = ProdutoResponseDTO.createMock();
//
//        //produtos.add (new Produto(1L, "Smart TV", "Smart Tv LG LED 50 Polegadas", 2285.0));
//        //produtos.add (new Produto(2L, "Mouse", "Mouse sem fio", 250.0));
//        //produtos.add (new Produto(3L, "Teclado", "Teclado sem fio", 278.95));
//
//        return ResponseEntity.ok(dto);
//    }

//    @PostMapping
//    public ResponseEntity<ProdutoResponseDTO> createProduto(
//            @RequestBody ProdutoInputDTO inputDTO) {
//        ProdutoResponseDTO dto = new ProdutoResponseDTO(1L, inputDTO.getNome(), inputDTO.getDescricao(), inputDTO.getValor());
//
//        return ResponseEntity.created(null).body(dto);
//    }




}
