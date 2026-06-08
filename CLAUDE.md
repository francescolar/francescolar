# CLAUDE.md

This file provides guidance to Claude Code when working with code in this repository.

## Project Overview

GitHub profile automation repository for `github.com/francescolar`. It auto-generates and keeps the profile README updated with live GitHub data (recent contributions, latest repos, recently starred repos) via a Go template and GitHub Actions.

## How It Works

There is no build step and no dependencies to install. The workflow is fully automated:

1. `README.gtpl` — Go template file; defines the profile README structure using [readme-scribe](https://github.com/muesli/readme-scribe) template functions
2. `.github/workflows/markscribe.yml` — GitHub Actions workflow that renders the template and commits the result back to `README.md`

The workflow runs on every push, on manual trigger, and on a daily cron schedule (midnight UTC).

## File Structure

```
francescolar/
├── README.gtpl          # Source template (edit this, not README.md)
├── README.md            # Generated output — do not edit manually
├── CREDITS.md           # Inspiration/attribution
└── .github/
    └── workflows/
        └── markscribe.yml
```

## Key Rules

- **Never edit `README.md` directly** — it is overwritten automatically by the CI workflow.
- All content changes go into `README.gtpl`.
- Template functions available: `recentContributions N`, `recentRepos N`, `recentStars N` (data pulled live from GitHub API).

## Related Projects

This profile README links to and mentions projects from:
- [`francescolar.github.io`](../francescolar.github.io) — static Bootstrap portfolio hosted at `git.francescolaruffa.dev`
- [`francescolaruffa.dev`](../francescolaruffa.dev) — modern Astro portfolio at `francescolaruffa.dev`
