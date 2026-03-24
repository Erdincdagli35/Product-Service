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
                productList.add(new Product(null, "Beck's", "Alman tarzı ferahlatıcı lager bira (50cl)", 270.0, Category.Beer));
                productList.add(new Product(null, "Belfast", "Hafif içimli yerli lager bira (50cl)", 250.0, Category.Beer));
                productList.add(new Product(null, "Bud", "Amerikan lager bira, yumuşak içim (50cl)", 270.0, Category.Beer));
                productList.add(new Product(null, "Corona", "Meksika lager bira, lime ile servis edilir (33cl)", 270.0, Category.Beer));
                productList.add(new Product(null, "Bomonti Filtresiz", "Yoğun aromalı filtresiz bira (50cl)", 250.0, Category.Beer));
                productList.add(new Product(null, "Efes Malt", "Malt aroması yoğun yerli bira (50cl)", 250.0, Category.Beer));
                productList.add(new Product(null, "Efes Özel Seri", "Özel üretim aromatik bira (50cl)", 250.0, Category.Beer));
                productList.add(new Product(null, "Miller", "Hafif ve ferah Amerikan bira (33cl)", 270.0, Category.Beer));

                // 🍸 Cin
                productList.add(new Product(null, "Gordon's Dry Gin (100cl)", "Klasik İngiliz dry gin, yoğun aromalı (100cl şişe)", 6000.0, Category.Gin));
                productList.add(new Product(null, "Gordon's Dry Gin (35cl)", "Klasik İngiliz dry gin, küçük boy şişe (35cl)", 2000.0, Category.Gin));

                // 🍹 Kokteyller
                productList.add(new Product(null, "American Margarita", "Tekila, triple sec ve lime ile hazırlanan klasik kokteyl", 750.0, Category.Cocktail));
                productList.add(new Product(null, "Aperol Spritz", "Aperol, prosecco ve soda ile ferahlatıcı İtalyan kokteyli", 750.0, Category.Cocktail));
                productList.add(new Product(null, "Aperol Soda", "Aperol ve soda ile hafif içimli kokteyl", 650.0, Category.Cocktail));
                productList.add(new Product(null, "Cin Tonik", "Gin ve tonik ile hazırlanan klasik kokteyl", 450.0, Category.Cocktail));
                productList.add(new Product(null, "Cin Fizz", "Gin, soda ve şeker ile hafif tatlı kokteyl", 550.0, Category.Cocktail));
                productList.add(new Product(null, "Espresso Martini", "Kahve aromalı votkalı kokteyl", 500.0, Category.Cocktail));
                productList.add(new Product(null, "Kuzu Kulağı Kokteyli", "Ferahlatıcı özel yaz kokteyli", 600.0, Category.Cocktail));
                productList.add(new Product(null, "Rom Sour", "Rom, lime ve şeker şurubu ile dengeli kokteyl", 600.0, Category.Cocktail));
                productList.add(new Product(null, "Sex on the Beach", "Votka, şeftali likörü ve meyve suları ile tropikal kokteyl", 650.0, Category.Cocktail));
                productList.add(new Product(null, "Jaigermaeisler", "Soğuk servis edilen shot içki", 650.0, Category.Cocktail));
                productList.add(new Product(null, "Cuba Libre", "Rom, cola ve lime ile hazırlanan klasik kokteyl", 550.0, Category.Cocktail));
                productList.add(new Product(null, "Long Island", "Votka, rom, tekila ve cin karışımı güçlü kokteyl", 750.0, Category.Cocktail));

                // 🥃 Rakı
                productList.add(new Product(null, "Beylerbeyi Göbek (100cl)", "Premium göbek rakı, yumuşak içim (100cl)", 3300.0, Category.Raki));
                productList.add(new Product(null, "Beylerbeyi Göbek (70cl)", "Premium göbek rakı, dengeli aroma (70cl)", 2500.0, Category.Raki));
                productList.add(new Product(null, "Beylerbeyi Göbek (35cl)", "Premium göbek rakı, küçük boy (35cl)", 1900.0, Category.Raki));
                productList.add(new Product(null, "Rakı Double", "İki ölçü rakı servis", 500.0, Category.Raki));
                productList.add(new Product(null, "Rakı Tek", "Tek ölçü rakı servis", 300.0, Category.Raki));

                // 🥃 Liquor
                productList.add(new Product(null, "Archers", "Şeftali aromalı likör", 200.0, Category.Liquor));
                productList.add(new Product(null, "Baileys", "Kremalı İrlanda likörü", 300.0, Category.Liquor));
                productList.add(new Product(null, "Campari", "Acımsı aromalı İtalyan aperatif likör", 650.0, Category.Liquor));

                // 🍷 Şarap
                productList.add(new Product(null, "Antre - Beyaz Şarap", "Sauvignon Blanc üzümünden ferah beyaz şarap", 1450.0, Category.Wine));
                productList.add(new Product(null, "Antre - Kırmızı Şarap", "Öküzgözü & Boğazkere harmanı kırmızı şarap", 1300.0, Category.Wine));
                productList.add(new Product(null, "Antre - Rose", "Kalecik Karası & Sangiovese rose şarap", 1450.0, Category.Wine));
                productList.add(new Product(null, "Smyrna Blush", "Grenache ve Shiraz üzüm karışımı rose", 1000.0, Category.Wine));
                productList.add(new Product(null, "Idol Beyaz", "Ugni Blanc ve Chardonnay beyaz şarap", 1650.0, Category.Wine));
                productList.add(new Product(null, "Idol Kırmızı", "Cabernet Sauvignon ve Merlot kırmızı şarap", 1700.0, Category.Wine));
                productList.add(new Product(null, "Idol Rose", "Kalecik Karası üzümünden rose şarap", 1750.0, Category.Wine));
                productList.add(new Product(null, "Bottega - Prosecco", "İtalyan köpüklü şarap", 600.0, Category.Wine));
                productList.add(new Product(null, "Beyaz Şarap", "Kadeh beyaz şarap", 400.0, Category.Wine));
                productList.add(new Product(null, "Kırmızı Şarap", "Kadeh kırmızı şarap", 400.0, Category.Wine));
                productList.add(new Product(null, "Rose", "Kadeh rose şarap", 400.0, Category.Wine));

                // 🥃 Viski
                productList.add(new Product(null, "Johnnie Walker Black Label", "12 yıllık harman viski, zengin aroma (100cl)", 4000.0, Category.Whiskey));
                productList.add(new Product(null, "Johnnie Walker Black Label", "12 yıllık harman viski (70cl)", 3500.0, Category.Whiskey));
                productList.add(new Product(null, "Johnnie Walker Black Label", "12 yıllık harman viski (50cl)", 980.0, Category.Whiskey));
                productList.add(new Product(null, "Johnnie Walker Black Label", "Double porsiyon servis", 1250.0, Category.Whiskey));
                productList.add(new Product(null, "Talisker Skye", "Single malt İskoç viski, yoğun ve isli aroma", 4500.0, Category.Whiskey));

                // 🍸 Votka
                productList.add(new Product(null, "Smirnoff (100cl)", "Klasik votka, yumuşak içim (100cl)", 6000.0, Category.Vodka));
                productList.add(new Product(null, "Smirnoff (70cl)", "Klasik votka (70cl)", 4000.0, Category.Vodka));

                // 🍽️ Ana Yemekler
                productList.add(new Product(null, "Bonfile", "Izgara dana bonfile, yanında garnitür ile", 1200.0, Category.Meal));
                productList.add(new Product(null, "Izgara Köfte", "Ev yapımı köfte, köz sebze ile", 550.0, Category.Meal));
                productList.add(new Product(null, "Izgara Köfte - 1,5 Porsiyon", "1,5 porsiyon ev yapımı köfte", 750.0, Category.Meal));
                productList.add(new Product(null, "Izgara Tavuk", "Izgara tavuk göğsü ve garnitür", 550.0, Category.Meal));
                productList.add(new Product(null, "Karışık Izgara", "Et, köfte ve tavuk karışık ızgara", 2000.0, Category.Meal));
                productList.add(new Product(null, "Kuzu Pirzola", "Izgara kuzu pirzola", 900.0, Category.Meal));
                productList.add(new Product(null, "Kuzu Şiş", "Izgara kuzu şiş", 750.0, Category.Meal));
                productList.add(new Product(null, "Tavuk Schnitzel", "Pane kaplı kızarmış tavuk", 500.0, Category.Meal));

                // 🍟 Atıştırmalıklar
                productList.add(new Product(null, "Çıtır Sepeti", "Karışık kızartma tabağı", 500.0, Category.Snack));
                productList.add(new Product(null, "Double Çıtır Sepeti", "Büyük boy karışık kızartma", 1000.0, Category.Snack));
                productList.add(new Product(null, "Çorba", "Günün çorbası", 300.0, Category.Snack));
                productList.add(new Product(null, "Patates Kızarması", "Kızarmış patates", 200.0, Category.Snack));
                productList.add(new Product(null, "Peynir Tabağı", "Şarapla uyumlu peynir çeşitleri", 500.0, Category.Snack));
                productList.add(new Product(null, "Sigara Böreği", "Kızarmış peynirli börek", 200.0, Category.Snack));
                productList.add(new Product(null, "Sosis Tava", "Kızarmış sosis", 300.0, Category.Snack));
                productList.add(new Product(null, "Karışık Tost", "Kaşar ve sucuklu tost", 400.0, Category.Snack));
                productList.add(new Product(null, "Kaşarlı Tost", "Eritilmiş kaşar peyniri ile tost", 300.0, Category.Snack));
                productList.add(new Product(null, "Sucuklu Kaşarlı Tost", "Sucuk ve kaşar peynirli tost", 450.0, Category.Snack));
                productList.add(new Product(null, "Sucuklu Tost", "Sucuklu tost", 350.0, Category.Snack));

                // 🍉 Meyve
                productList.add(new Product(null, "Kavun - Karpuz Tabağı", "Mevsim meyveleri tabağı", 300.0, Category.Fruit));
                productList.add(new Product(null, "Meyve Tabağı", "Karışık meyve tabağı", 400.0, Category.Fruit));
                productList.add(new Product(null, "Meyve Tabağı Lüx", "Özel sunum karışık meyve tabağı", 500.0, Category.Fruit));

                // 🍔 Burger
                productList.add(new Product(null, "Cheeseburger", "Dana burger ve cheddar peyniri", 750.0, Category.Burger));
                productList.add(new Product(null, "Hamburger", "Izgara dana burger", 550.0, Category.Burger));

                // 🍝 Makarna
                productList.add(new Product(null, "Makarna", "Sade makarna", 550.0, Category.Pasta));
                productList.add(new Product(null, "Bolonez Makarna", "Kıymalı domates soslu makarna", 450.0, Category.Pasta));
                productList.add(new Product(null, "Kremalı Tavuklu Makarna", "Kremalı tavuklu makarna", 550.0, Category.Pasta));
                productList.add(new Product(null, "Napolitan Makarna", "Domates soslu makarna", 450.0, Category.Pasta));
                productList.add(new Product(null, "Pesto Soslu Makarna", "Fesleğenli pesto soslu makarna", 450.0, Category.Pasta));
                productList.add(new Product(null, "Tavuk Penne Fungi Makarna", "Tavuk ve mantarlı makarna", 550.0, Category.Pasta));

                // 🥗 Salata
                productList.add(new Product(null, "Çoban Salata", "Domates, salatalık ve zeytinyağı", 300.0, Category.Salad));
                productList.add(new Product(null, "Mevsim Salata", "Taze yeşilliklerden oluşan salata", 250.0, Category.Salad));
                productList.add(new Product(null, "Peynirli Salata", "Beyaz peynirli salata", 350.0, Category.Salad));
                productList.add(new Product(null, "Domates Salatalık Söğüş", "Taze doğranmış sebzeler", 200.0, Category.Salad));
                productList.add(new Product(null, "Tavuklu Salata", "Izgara tavuklu salata", 500.0, Category.Salad));
                productList.add(new Product(null, "Ton Balıklı Salata", "Ton balıklı salata", 350.0, Category.Salad));

                // 🍤 Aperatif
                productList.add(new Product(null, "Kalamar Tava", "Kızarmış kalamar", 750.0, Category.Appetizer));
                productList.add(new Product(null, "Karides Tava", "Tereyağlı karides", 750.0, Category.Appetizer));
                productList.add(new Product(null, "Meze", "Günün mezeleri", 400.0, Category.Appetizer));
                productList.add(new Product(null, "Peynir Tabağı", "Karışık peynir tabağı", 500.0, Category.Appetizer));
                productList.add(new Product(null, "Zeytin Tabağı", "Zeytin çeşitleri", 200.0, Category.Appetizer));

                // ☕ Kahve
                productList.add(new Product(null, "Americano", "Espresso ve sıcak su", 130.0, Category.Coffee));
                productList.add(new Product(null, "Café Crema", "Yoğun kremalı kahve", 150.0, Category.Coffee));
                productList.add(new Product(null, "Cappuccino", "Espresso, süt ve köpük", 150.0, Category.Coffee));
                productList.add(new Product(null, "Espresso", "Yoğun kahve shot", 150.0, Category.Coffee));
                productList.add(new Product(null, "Latte", "Sütlü espresso", 150.0, Category.Coffee));
                productList.add(new Product(null, "Flat White", "Kremalı sütlü kahve", 150.0, Category.Coffee));
                productList.add(new Product(null, "Filtre Kahve", "Demleme kahve", 130.0, Category.Coffee));
                productList.add(new Product(null, "Nescafe", "Hazır kahve", 120.0, Category.Coffee));
                productList.add(new Product(null, "Ice Latte", "Soğuk sütlü kahve", 180.0, Category.Coffee));
                productList.add(new Product(null, "Ice Americano", "Soğuk americano", 150.0, Category.Coffee));
                productList.add(new Product(null, "Ice Coffee", "Soğuk kahve", 180.0, Category.Coffee));

                // 🍵 Sıcak
                productList.add(new Product(null, "Çay", "Demleme siyah çay", 50.0, Category.HotDrink));
                productList.add(new Product(null, "Fincan Çay", "Fincanda servis çay", 75.0, Category.HotDrink));
                productList.add(new Product(null, "Termos Çay", "Termos çay", 200.0, Category.HotDrink));
                productList.add(new Product(null, "Türk Kahvesi", "Geleneksel Türk kahvesi", 100.0, Category.HotDrink));
                productList.add(new Product(null, "Türk Kahvesi - Double", "Double Türk kahvesi", 350.0, Category.HotDrink));

                // 🥤 Soğuk
                productList.add(new Product(null, "Cola", "Gazlı içecek", 150.0, Category.SoftDrink));
                productList.add(new Product(null, "Fanta", "Portakallı gazlı içecek", 150.0, Category.SoftDrink));
                productList.add(new Product(null, "Sprite", "Limonlu gazlı içecek", 150.0, Category.SoftDrink));
                productList.add(new Product(null, "Cappy", "Meyve suyu", 130.0, Category.SoftDrink));
                productList.add(new Product(null, "Fuse Tea", "Soğuk çay", 130.0, Category.SoftDrink));
                productList.add(new Product(null, "Soda", "Maden suyu", 60.0, Category.SoftDrink));
                productList.add(new Product(null, "Su", "İçme suyu", 50.0, Category.SoftDrink));
                productList.add(new Product(null, "Ayran", "Yoğurt içeceği", 100.0, Category.SoftDrink));
                productList.add(new Product(null, "Büyük Su", "1L su", 100.0, Category.SoftDrink));
                productList.add(new Product(null, "Küçük Su", "0.5L su", 50.0, Category.SoftDrink));
                productList.add(new Product(null, "Churchill", "Soda, limon ve tuz", 100.0, Category.SoftDrink));
                productList.add(new Product(null, "Redbull", "Enerji içeceği", 300.0, Category.SoftDrink));
                productList.add(new Product(null, "Scwheeps", "Aromalı gazlı içecek", 130.0, Category.SoftDrink));

                pr.saveAll(productList);
            }
        };
    }

}
