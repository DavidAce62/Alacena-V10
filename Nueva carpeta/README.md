# InventoryApp

Aplicación Android para administrar inventario usando Kotlin, MVVM y Room.

## 🚀 Compilar en Gitpod

1. Haz fork del repositorio en GitHub.
2. Abre [Gitpod](https://gitpod.io) y pega la URL del repo.
3. Gitpod usará el archivo `.gitpod.yml` para configurar el entorno.

### ✅ Pasos:
```bash
# Clonar el repo
https://gitpod.io/#https://github.com/<TU_USUARIO>/InventoryApp

# Compilar
./gradlew build

# Ejecutar pruebas
./gradlew test
```

## 📌 Subir a GitHub
```bash
cd InventoryApp
git init
git add .
git commit -m "Initial commit: InventoryApp base"
git branch -M main
git remote add origin https://github.com/<TU_USUARIO>/InventoryApp.git
git push -u origin main
```

## 📂 Estructura
- `data/` → Entidades y DAO (Room)
- `ui/` → Activities y Fragments
- `viewmodel/` → Lógica MVVM

## ⚙️ Requisitos
- Android Studio (o entorno Gitpod con SDK)
- JDK 11+
- Gradle
