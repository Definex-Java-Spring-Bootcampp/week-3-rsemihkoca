package com.rsemihkoca.orderservicemain.controller;


import com.rsemihkoca.orderservicemain.model.Order;
import com.rsemihkoca.orderservicemain.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/onlinealisveris/v1/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

/*
*
    müşteriSepetGetir +
    * /sepeteEkle: eğer açık sipariş yoksa yarat varsa +
ona ekle iptal edene kadar,
*
/sipariş Onayla
* /siparişIptal: sepetteki ürünleri siler
    * */

    @PostMapping("user/{userId}/approve")
    public ResponseEntity<Order> approveOrder(@PathVariable Long userId) {
        // userid user var mı kontrol et
        // user varsa preorder var mı kontrol et
        // pre order varsa statusu approve yap Siparişiniz alınmıştır.
        // yoksa Sepetinizde ürün bulunmamaktadır dön
        // Approvedan sonra rabitmq'ya fatura servise gönder
        return ResponseEntity.ok(orderService.approveOrder());
    }

    @PostMapping("user/{userId}/add/{productId}")
    public ResponseEntity<Order> addProductToOrder(@PathVariable Long userId, @PathVariable String productId) {
        // userid user var mı kontrol et
        // user varsa order var mı şu an kontrol et
        // order yoksa yeni order oluştur
        // ürün stokta var mı kontrol et aynı üründen varsa toplu şekilde kontrol et
        // stokta yoksa Sepetinizde ürün bulunmamaktadır dön veya stokta 2 ürün var 3 ürün eklemeye çalışıyorsa Sepetinizde ürün bulunmamaktadır dön
        // içine ürünü ekle invoice güncelle.
        return ResponseEntity.ok(orderService.addProductToOrder());
    }

    @PostMapping("user/{userId}/cancel")
    public ResponseEntity<Order> cancelOrder(@PathVariable Long userId) {
        // userid user var mı kontrol et
        // user varsa order var mı kontrol et
        // preorder varsa statusu cancel yap Cancelled Order dön
        // yoksa Sepetinizde ürün bulunmamaktadır dön
        return ResponseEntity.ok(orderService.cancelOrder());
    }

    @GetMapping("user/{userId}")
    public ResponseEntity<Order> getOrderofCustomer(@PathVariable Long userId) {
        // userid user var mı kontrol et
        // user varsa order var mı kontrol et
        // pre order varsa preorder dön yoksa Sepetinizde ürün bulunmamaktadır dön
        return ResponseEntity.ok(orderService.getOrderofCustomer());
    }


    @GetMapping
    public ResponseEntity<List<Order>> getAll() {
        return ResponseEntity.ok(orderService.getAll());
    }

    @GetMapping("errorTest")
    public ResponseEntity<List<Order>> testKafka() {
        throw new RuntimeException("test exception");
    }

}
