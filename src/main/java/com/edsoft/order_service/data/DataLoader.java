package com.edsoft.order_service.data;

import com.edsoft.order_service.model.Category;
import com.edsoft.order_service.model.Product;
import com.edsoft.order_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataLoader {

    @Autowired
    public ProductRepository pr;

    @Bean
    public CommandLineRunner seed() {

        return args -> {
            if (pr.count() == 0) {

                List<Product> productList = new ArrayList<>();
                // 🍺 Bira
                productList.add(new Product(null, "Beck's", "50cl şişe bira", 270.0, Category.Beer));
                productList.add(new Product(null, "Belfast", "50cl şişe bira", 250.0, Category.Beer));
                productList.add(new Product(null, "Bud", "50cl şişe bira", 270.0, Category.Beer));
                productList.add(new Product(null, "Corona", "33cl şişe bira", 270.0, Category.Beer));
                productList.add(new Product(null, "Bomonti Filtresiz", "50cl şişe bira", 250.0, Category.Beer));
                productList.add(new Product(null, "Efes Malt", "50cl şişe bira", 250.0, Category.Beer));
                productList.add(new Product(null, "Efes Özel Seri", "50cl şişe bira", 250.0, Category.Beer));
                productList.add(new Product(null, "Miller", "33cl şişe bira", 270.0, Category.Beer));

                // 🍸 Cin
                productList.add(new Product(null, "Gordon's Dry Gin (100cl)", "100cl şişe", 6000.0, Category.Gin));
                productList.add(new Product(null, "Gordon's Dry Gin (35cl)", "35cl şişe", 2000.0,Category.Gin));
                productList.add(new Product(null, "Gordon's Premium Pink (70cl)", "70cl şişe", 4000.0,Category.Gin));

                // 🍹 Kokteyller
                productList.add(new Product(null, "American Margarita", "Tekila, triple sec, lime", 750.0,Category.Cocktail));
                productList.add(new Product(null, "Aperol Spritz", "Aperol, prosecco, soda", 750.0,Category.Cocktail));
                productList.add(new Product(null, "Cin Tonik", "Klasik gin & tonic", 450.0,Category.Cocktail));
                productList.add(new Product(null, "Espresso Martini", "Kahve aromalı votkalı kokteyl", 500.0,Category.Cocktail));
                productList.add(new Product(null, "Kuzu Kulağı Kokteyli", "Navali Special – ferahlatıcı yaz kokteyli", 600.0,Category.Cocktail));
                productList.add(new Product(null, "Rom Sour", "Rom, lime, şeker şurubu", 600.0,Category.Cocktail));
                productList.add(new Product(null, "Sex on the Beach", "Votka, şeftali likörü, portakal ve kızılcık suyu", 650.0,Category.Cocktail));

                // 🥃 Rakı
                productList.add(new Product(null, "Beylerbeyi Göbek (100cl)", "100cl şişe", 3300.0,Category.Raki));
                productList.add(new Product(null, "Beylerbeyi Göbek (70cl)", "70cl şişe", 2500.0,Category.Raki));
                productList.add(new Product(null, "Beylerbeyi Göbek (35cl)", "35cl şişe", 1900.0,Category.Raki));
                productList.add(new Product(null, "Rakı Double", "İki ölçü rakı", 500.0,Category.Raki));
                productList.add(new Product(null, "Rakı Tek", "Bir ölçü rakı", 300.0,Category.Raki));

                // 🍷 Şarap
                productList.add(new Product(null, "Antre - Beyaz Şarap", "Sauvignon Blanc", 1450.0,Category.Wine));
                productList.add(new Product(null, "Antre - Kırmızı Şarap", "Öküzgözü & Boğazkere", 1300.0,Category.Wine));
                productList.add(new Product(null, "Antre - Rose", "Kalecik Karası & Sangiovese", 1450.0,Category.Wine));
                productList.add(new Product(null, "Smyrna Blush", "Grenache - Shiraz", 1000.0,Category.Wine));

                // 🥃 Viski
                productList.add(new Product(null, "Johnnie Walker Black Label", "12 yıllık, 100cl", 4000.0,Category.Whiskey));
                productList.add(new Product(null, "Talisker Skye", "Single malt, 70cl", 4500.0,Category.Whiskey));

                // 🍸 Votka
                productList.add(new Product(null, "Smirnoff (100cl)", "100cl şişe", 6000.0,Category.Votka));
                productList.add(new Product(null, "Smirnoff (70cl)", "70cl şişe", 4000.0,Category.Votka));

                // 🍽️ Ana Yemekler
                productList.add(new Product(null, "Bonfile", "Izgara dana bonfile", 1200.0,Category.Meal));
                productList.add(new Product(null, "Izgara Köfte", "Ev yapımı köfte", 550.0,Category.Meal));
                productList.add(new Product(null, "Izgara Tavuk", "Izgara tavuk göğsü", 550.0,Category.Meal));
                productList.add(new Product(null, "Karışık Izgara", "Et, köfte ve tavuk karışımı", 2000.0,Category.Meal));
                productList.add(new Product(null, "Kuzu Pirzola", "Izgara kuzu pirzola", 900.0,Category.Meal));
                productList.add(new Product(null, "Kuzu Şiş", "Izgara kuzu şiş", 750.0,Category.Meal));
                productList.add(new Product(null, "Tavuk Schnitzel", "Pane kaplamalı tavuk", 500.0,Category.Meal));

                // 🍟 Atıştırmalıklar
                productList.add(new Product(null, "Çıtır Sepeti", "Karışık kızartma tabağı", 500.0,Category.Snack));
                productList.add(new Product(null, "Çorba", "Günün çorbası", 300.0,Category.Snack));
                productList.add(new Product(null, "Patates Kızarması", "Kızarmış patates", 200.0,Category.Snack));
                productList.add(new Product(null, "Peynir Tabağı", "Şarapla servis edilir", 500.0,Category.Snack));
                productList.add(new Product(null, "Sigara Böreği", "Kızarmış peynirli börek", 200.0,Category.Snack));
                productList.add(new Product(null, "Sosis Tava", "Kızarmış sosis", 300.0,Category.Snack));

                productList.add(new Product(null, "Cheeseburger", "Dana burger ve cheddar peyniri", 750.0,Category.Burger));
                productList.add(new Product(null, "Hamburger", "Klasik dana burger", 550.0,Category.Burger));

                // ☕ Kahveler
                productList.add(new Product(null, "Americano", "Sıcak espresso ve su karışımı", 130.0,Category.Coffee));
                productList.add(new Product(null, "Café Crema", "Yoğun kremalı kahve", 150.0,Category.Coffee));
                productList.add(new Product(null, "Cappuccino", "Espresso, süt ve süt köpüğü", 150.0,Category.Coffee));
                productList.add(new Product(null, "Espresso", "Yoğun shot kahve", 150.0,Category.Coffee));
                productList.add(new Product(null, "Latte", "Sütlü espresso", 150.0,Category.Coffee));
                productList.add(new Product(null, "Flat White", "Kremalı sütlü espresso", 150.0,Category.Coffee));
                productList.add(new Product(null, "Filtre Kahve", "Klasik demleme kahve", 130.0,Category.Coffee));
                productList.add(new Product(null, "Nescafe", "Hazır kahve", 120.0,Category.Coffee));
                productList.add(new Product(null, "Ice Latte", "Soğuk sütlü espresso", 180.0,Category.Coffee));
                productList.add(new Product(null, "Ice Americano", "Soğuk espresso ve su", 150.0,Category.Coffee));
                productList.add(new Product(null, "Ice Coffee", "Nescafe ve buz karışımı", 180.0,Category.Coffee));

                // 🍵 Sıcak İçecekler
                productList.add(new Product(null, "Çay", "Demleme siyah çay", 50.0,Category.HotDrink));
                productList.add(new Product(null, "Türk Kahvesi", "Klasik Türk kahvesi", 100.0,Category.HotDrink));

                pr.saveAll(productList);
            }
        };
    }

}
