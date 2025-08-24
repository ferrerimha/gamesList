# DsList API 🚀

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.0-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.9.9-red)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-blue)

API do **DsList**, projeto desenvolvido no **Intensivo de Backend do Nélio Alves**.  
Permite consultar jogos e listas de jogos diretamente através de endpoints REST.  

🔗 **Deploy:** [https://dslist.ferrerimha.shop](https://dslist.ferrerimha.shop)  

---

## Base URL

```
https://dslist.ferrerimha.shop/api
```

---

## Endpoints

| Endpoint | Método | Descrição | Parâmetros |
|----------|-------|-----------|------------|
| [`/games`](#1-listar-todos-os-jogos) | GET | Lista todos os jogos | - |
| [`/games/{id}`](#2-buscar-um-jogo-pelo-id) | GET | Retorna um jogo pelo ID | `id` = ID do jogo |
| [`/gamelist`](#3-listar-todas-as-listas-de-jogos) | GET | Lista todas as listas de jogos | - |
| [`/{id}/games`](#4-listar-todos-os-jogos-de-uma-lista-específica) | GET | Lista todos os jogos de uma lista específica | `id` = ID da lista |

---

### 1. Listar todos os jogos

```bash
GET https://dslist.ferrerimha.shop/api/games
```

**Resposta (exemplo):**

```json
[
  {
    "id": 1,
    "title": "The Witcher 3",
    "gameYear": 2015,
    "imgUrl": "https://exemplo.com/witcher3.jpg",
    "shortDescription": "RPG de ação em mundo aberto"
  },
  {
    "id": 2,
    "title": "Cyberpunk 2077",
    "gameYear": 2020,
    "imgUrl": "https://exemplo.com/cyberpunk2077.jpg",
    "shortDescription": "RPG futurista"
  }
]
```

---

### 2. Buscar um jogo pelo ID

```bash
GET https://dslist.ferrerimha.shop/api/games/1
```

**Resposta (exemplo):**

```json
{
  "id": 1,
  "title": "The Witcher 3",
  "gameYear": 2015,
  "imgUrl": "https://exemplo.com/witcher3.jpg",
  "shortDescription": "RPG de ação em mundo aberto"
}
```

---

### 3. Listar todas as listas de jogos

```bash
GET https://dslist.ferrerimha.shop/api/gamelist
```

**Resposta (exemplo):**

```json
[
  {
    "id": 1,
    "name": "RPGs Favoritos"
  },
  {
    "id": 2,
    "name": "Ação e Aventura"
  }
]
```

---

### 4. Listar todos os jogos de uma lista específica

```bash
GET https://dslist.ferrerimha.shop/api/1/games
```

**Resposta (exemplo):**

```json
[
  {
    "id": 1,
    "title": "The Witcher 3",
    "gameYear": 2015,
    "imgUrl": "https://exemplo.com/witcher3.jpg",
    "shortDescription": "RPG de ação em mundo aberto"
  }
]
```

---

> 📌 Todas as respostas estão no formato JSON.  
> 🔗 Acesse a API diretamente: [https://dslist.ferrerimha.shop/api](https://dslist.ferrerimha.shop/api)
