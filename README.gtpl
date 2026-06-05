### Francesco La Ruffa

> /'fran.tʃe.sko/

I'm a software developer based in Bologna, Italy. I like building things that actually work — from real-time multiplayer games to low-level Java libraries. I work mostly with PHP, Java, TypeScript and Vue.js, with a growing interest in DevOps and AI integration.

[`🌐 francescolaruffa.dev`](https://francescolaruffa.dev)
[`📫 laruffafrancesco1@gmail.com`](mailto:laruffafrancesco1@gmail.com)
[`💼 linkedin.com/in/francesco-la-ruffa`](https://www.linkedin.com/in/francesco-la-ruffa/)

### 👷 Check out what I'm currently working on
{{ range recentContributions 3 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ printf "%.80s" .Repo.Description }}
{{- end }}

### 🌱 My latest projects
{{ range recentRepos 3 }}
- [{{ .Name }}]({{ .URL }}) - {{ printf "%.80s" .Description }}
{{- end }}

### ⭐ Recent Stars
{{ range recentStars 3 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ printf "%.80s" .Repo.Description }}
{{- end }}

{{/*
### 💖 Recent followers
{{ range followers 5 }}
- [**@{{ .Login }}**]({{ .URL }})
{{- end }}
*/}}
