# SafeServer Minecraft Eklentisi

<p align="center">
  <img src="https://i.ibb.co/tpV6HqXq/resim-2025-05-06-201014907.png" alt="KynuxCloud Logo" width="200"/>
</p>

<div align="center">
  <strong>Minecraft 1.21.1 için Güvenlik Eklentisi</strong><br>
  LoraMC Sunucusu için özel olarak geliştirilmiştir
</div>

<br>

<div align="center">
  <a href="https://discord.gg/MMZBGdX5fB"><img src="https://img.shields.io/badge/LoraMC-Discord-7289DA.svg?style=flat-square&logo=discord" alt="LoraMC Discord"/></a>
  <a href="https://kynux.cloud"><img src="https://img.shields.io/badge/KynuxCloud-Website-blue.svg?style=flat-square" alt="KynuxCloud Website"/></a>
  <a href="https://discord.gg/wCK5dVSY2n"><img src="https://img.shields.io/badge/KynuxCloud-Discord-7289DA.svg?style=flat-square&logo=discord" alt="KynuxCloud Discord"/></a>
</div>

<br>

## 📋 İçindekiler

- [📋 İçindekiler](#-i̇çindekiler)
- [📖 Hakkında](#-hakkında)
- [✨ Özellikler](#-özellikler)
- [🚀 Kurulum](#-kurulum)
- [⚙️ Konfigürasyon](#️-konfigürasyon)
- [📝 Kullanım](#-kullanım)
- [👨‍💻 Geliştirici](#-geliştirici)
- [📄 Lisans](#-lisans)

## 📖 Hakkında

**SafeServer**, Minecraft sunucularında çeşitli güvenlik risklerini ortadan kaldırmak için özel olarak tasarlanmış bir eklentidir. Bu eklenti, özellikle LoraMC (https://discord.gg/MMZBGdX5fB) sunucusu için KynuxCloud CEO'su Kynux tarafından geliştirilmiştir.

Eklenti, sunucunuzda çeşitli zarar verici öğelerin (TNT, End Kristali, raylar, vagonlar vb.) craftlanmasını, kullanılmasını ve yerleştirilmesini tamamen engeller. Ayrıca, örs kullanımı, piston, dispenser ve redstone mekanizmaları gibi çeşitli yöntemlerle bu kısıtlamaların atlatılmasını önlemek için gelişmiş güvenlik önlemleri içerir.

Bu eklenti, Minecraft 1.21.1 sürümü ile tam uyumlu olup Spigot/Paper API kullanılarak geliştirilmiştir.

## ✨ Özellikler

### Engellenen Öğeler

- **TNT ve Türevleri:**
  - Normal TNT
  - TNT'li Vagonlar

- **End Kristali:**
  - End Kristali tamamen engellendi

- **Tüm Ray Türleri:**
  - Normal Ray
  - Güçlendirilmiş Ray
  - Dedektör Rayı
  - Aktivatör Rayı

- **Tüm Vagon Türleri:**
  - Normal Vagon
  - Sandıklı Vagon
  - Fırınlı Vagon
  - TNT'li Vagon
  - Komut Bloğu Vagonu
  - Huni Vagonu

### Güvenlik Önlemleri

#### Temel Engelleme Mekanizmaları

- ✅ Yasaklı öğelerin craftlanması tamamen engellendi
- ✅ Yasaklı öğelerin yere yerleştirilmesi engellendi
- ✅ Yasaklı öğeler envanterde olsa bile kullanılamaz
- ✅ Yasaklı eylemlerde oyuncuya bilgilendirici mesajlar gösterilir

#### Örs (Anvil) Koruması

- ✅ Yasaklı öğelerin örste isim değiştirilmesi engellendi
- ✅ Yasaklı öğelerin örste birleştirilmesi engellendi
- ✅ Yasaklı öğelerin örste herhangi bir işlemi engellendi

#### Gelişmiş Exploit Önleme

- ✅ Piston kullanarak yasaklı blokların taşınması engellendi
- ✅ Dispenser kullanarak yasaklı öğelerin yerleştirilmesi engellendi
- ✅ Redstone ile TNT'nin aktifleştirilmesi engellendi
- ✅ Patlama olaylarında yasaklı blokların etkilenmesi engellendi
- ✅ Yasaklı vagonlar otomatik olarak kaldırılır

## 🚀 Kurulum

Eklentiyi sunucunuza kurmak için aşağıdaki adımları izleyin:

1. Sunucunuzu durdurun
2. Eklenti JAR dosyasını sunucunuzun `plugins` klasörüne yerleştirin
3. Sunucuyu yeniden başlatın
4. Konsolu kontrol edin ve "SafeServer eklentisi başarıyla başlatıldı!" mesajını gördüğünüzden emin olun

## ⚙️ Konfigürasyon

Bu sürümde özel bir konfigürasyon dosyası bulunmamaktadır. Eklenti, ön tanımlı güvenlik önlemleri ile çalışır.

## 📝 Kullanım

Eklenti kurulduktan sonra ek bir yapılandırma gerektirmez. Otomatik olarak aşağıdaki koruma mekanizmalarını aktif eder:

- ⚠️ Oyuncular yasaklı öğeleri craftlamaya çalıştıklarında craft işlemi iptal edilir
- ⚠️ Yasaklı öğeleri yere yerleştirmeye çalışan oyunculara "Bu öğe güvenlik nedeniyle yere yerleştirilemez!" mesajı gösterilir
- ⚠️ Yasaklı öğeleri kullanmaya çalışan oyunculara "Bu öğe güvenlik nedeniyle kullanılamaz!" mesajı gösterilir
- ⚠️ Yasaklı öğeleri örste kullanmaya çalışan oyunculara "Bu öğe güvenlik nedeniyle örste kullanılamaz!" mesajı gösterilir
- ⚠️ Yasaklı öğeleri craftlamaya çalışan oyunculara "Bu öğe güvenlik nedeniyle craftlanamaz!" mesajı gösterilir

## 👨‍💻 Geliştirici

<div align="center">
  <img src="https://avatars.githubusercontent.com/kynuxdev" alt="Kynux" width="100" style="border-radius: 50%"/>
  <h3>Kynux</h3>
  <p>KynuxCloud CEO'su</p>
  
  <div>
    <a href="https://kynux.cloud"><img src="https://img.shields.io/badge/Website-kynux.cloud-blue.svg?style=flat-square" alt="Website"/></a>
    <a href="https://discord.gg/wCK5dVSY2n"><img src="https://img.shields.io/badge/Discord-KynuxCloud-7289DA.svg?style=flat-square&logo=discord" alt="Discord"/></a>
    <a href="https://instagram.com/kynux_dev"><img src="https://img.shields.io/badge/Instagram-@kynux__dev-E4405F.svg?style=flat-square&logo=instagram" alt="Instagram"/></a>
    <a href="https://github.com/kynuxdev"><img src="https://img.shields.io/badge/GitHub-kynuxdev-181717.svg?style=flat-square&logo=github" alt="GitHub"/></a>
  </div>
</div>

<div align="center">
  <br>
  <strong>Bu eklenti LoraMC (https://discord.gg/MMZBGdX5fB) için özel olarak geliştirilmiştir.</strong>
</div>

## 📄 Lisans

Bu eklenti, tüm hakları saklı olarak KynuxCloud ve Kynux tarafından geliştirilmiştir. Sadece örnek bir eklenti olması için yapılmıştır.

---

<div align="center">
  <p>© 2025 KynuxCloud - Tüm Hakları Saklıdır</p>
  <a href="https://kynux.cloud">https://kynux.cloud</a> | <a href="https://discord.gg/wCK5dVSY2n">Discord</a> | <a href="https://instagram.com/kynux_dev">Instagram</a> | <a href="https://github.com/kynuxdev">GitHub</a>
</div>
