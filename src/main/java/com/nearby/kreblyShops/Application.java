package com.nearby.kreblyShops;

 
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nearby.kreblyShops.model.Role;
import com.nearby.kreblyShops.model.Shop;
import com.nearby.kreblyShops.repository.RoleRepository;
import com.nearby.kreblyShops.repository.ShopRepository;

 

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		RoleRepository roleRepository = context.getBean(RoleRepository.class);
		ShopRepository shopRepository = context.getBean(ShopRepository.class);
		
		 // fill Role table 
		roleRepository.save(new Role("ROLE_USER"));
		roleRepository.save(new Role("ROLE_ADMIN"));
		
		 // fill Shop table 
		shopRepository.save(new Shop("Toni New", "https://images.unsplash.com/photo-1563357732-31978202a214?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.5511,33.574));
		shopRepository.save(new Shop("Bd De La Mode", "https://images.unsplash.com/photo-1527781708134-bc633ba98366?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-5.81631,35.77427));
		shopRepository.save(new Shop("Lee Cooper", "https://images.unsplash.com/photo-1569876957589-7d5969274655?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.64451,33.59406));
		shopRepository.save(new Shop("Bijouterie Dahim", "https://images.unsplash.com/photo-1534077293576-17f7f6624a1a?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.64084,33.59899));
		shopRepository.save(new Shop("Bijouterie al Fath", "https://images.unsplash.com/photo-1512722898403-c53d17d7d347?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.67538,33.57189));
		shopRepository.save(new Shop("Effervescence", "https://images.unsplash.com/photo-1517449066399-b9edafbc4444?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.64168,33.59367 ));
		shopRepository.save(new Shop("Boutique 2 ND", "https://images.unsplash.com/photo-1541198167315-5e9101deeb5c?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.97011,31.618));
		shopRepository.save(new Shop("Solde Sara", "https://images.unsplash.com/photo-1521566652839-697aa473761a?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.52235,33.5858));
		shopRepository.save(new Shop("Accessoires de Mercerie", "https://images.unsplash.com/photo-1529583302858-7143cb9440cb?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.54523,33.5793));
		shopRepository.save(new Shop("Boutique Assil", "https://images.unsplash.com/photo-1550085997-838afca7d3d4?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.64529,33.59573));
		shopRepository.save(new Shop("Chic Cho", "https://images.unsplash.com/photo-1559674178-acaf0e81b7ae?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.95939,31.607));
		shopRepository.save(new Shop("Des X Et Des Ailes", "https://images.unsplash.com/photo-1519378677857-bcaadd0a274e?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-6.88781,33.92157));
		shopRepository.save(new Shop("Uja-Un Jour Ailleurs", "https://images.unsplash.com/photo-1520071428715-eaeb26841394?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-6.82922,33.9679));
		shopRepository.save(new Shop("Sydney Love", "https://images.unsplash.com/photo-1556807044-eaf2e0eecb6d?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.56772,33.5889));
		shopRepository.save(new Shop("La Solderie des Marques", "https://images.unsplash.com/photo-1567072725199-453f752fa187?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.54434,33.58));
		shopRepository.save(new Shop("Lacoste Massira", "https://images.unsplash.com/photo-1565049732490-83a51bdcfbec?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.63808,33.58685));
		shopRepository.save(new Shop("Aroussat El Hamra", "https://images.unsplash.com/photo-1568728190355-b4020062cbe3?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-8.02262,31.5978));
		shopRepository.save(new Shop("Style Boutique", "https://images.unsplash.com/photo-1560284964-e8744d3bccad?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.55193,33.5562));
		shopRepository.save(new Shop("Kaftan Inou", "https://images.unsplash.com/photo-1528035417020-6685853dcd79?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.96251,31.614));
		shopRepository.save(new Shop("Mr Costume", "https://images.unsplash.com/photo-1512295478274-8c81adbb61e7?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-4.98443,34.00726));
		shopRepository.save(new Shop("Shop Marouane", "https://images.unsplash.com/photo-1559308573-f9dcd8492746?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.55792,33.5837));
		shopRepository.save(new Shop("Selverline", "https://images.unsplash.com/photo-1541699063900-dfa97114ae24?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.64544,33.59514));
		shopRepository.save(new Shop("Joe Black", "https://images.unsplash.com/photo-1532264523420-881a47db012d?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-4.98591,34.01466));
		shopRepository.save(new Shop("Studio 14", "https://images.unsplash.com/photo-1548665108-05230e076bea?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.64169,33.59296));
		shopRepository.save(new Shop("Boutique Foulard", "https://images.unsplash.com/photo-1531581680703-d6fb0db890b2?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.56999,33.5841));
		shopRepository.save(new Shop("Kaftan Kenza", "https://images.unsplash.com/photo-1533055640609-24b498dfd74c?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.56233,33.5864));
		shopRepository.save(new Shop("La Maison Tout Beldi", "https://images.unsplash.com/photo-1543676774-064b3f7c5ad7?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-6.8292,33.9741));
		shopRepository.save(new Shop("Miss Fantaisy", "https://images.unsplash.com/photo-1506388398822-866b2889530f?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-4.98714,34.01011));
		shopRepository.save(new Shop("Bigbang Kids", "https://images.unsplash.com/photo-1559329187-324b79e997b0?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.54831,33.5635));
		shopRepository.save(new Shop("Jeans Machine Outlet", "https://images.unsplash.com/photo-1565377572295-775293e25631?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEwNzkzM30",-7.60264,33.57256));
 	}

}
