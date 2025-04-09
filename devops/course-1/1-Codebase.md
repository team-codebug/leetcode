# 🧪 12-Factor App - Factor 1: Codebase

> _“One codebase tracked in version control, many deploys.”_

---

## 🧬 What's a Codebase, Anyway?

Think of the **codebase** as the DNA of your app — the single source of truth for everything it knows and does.

It lives in **version control** systems like:
- 🐙 Git (most common today)
- 🦎 Mercurial
- 🧾 Subversion (a classic)

And that version-controlled snapshot? That’s your **repo**. Simple.

---

## 🗂 One Codebase ≠ One App?

Exactly! Here's the golden rule:

> 💡 **One app = One codebase = Many deploys**

### ❌ Wrong:
- Multiple codebases powering one app? Nope.
- One codebase shared by many apps? Also nope.

### ✅ Right:
- One codebase (repo) powering multiple deploys (like dev, staging, production, or your local setup)? Perfect.

---

## 🚀 What’s a Deploy?

A **deploy** is just a running version of your app.

| Environment     | Description                                     |
|----------------|-------------------------------------------------|
| 🏭 Production    | Where real users live                           |
| 🧪 Staging       | Testing ground for new features                 |
| 👨‍💻 Local Dev     | Your personal lab for coding, debugging, and 💥  |

All these environments are **deploys of the same codebase**. They may run **different versions** (some commits ahead or behind), but they're still part of the same family.

---

## 🧠 Distributed Systems ≠ One App

If you’ve got:
- Multiple services
- Multiple codebases

...that’s a **distributed system**, not a single app.  
And that’s okay! Just remember:

> 🧩 Each component should be treated as its own 12-factor app.

---

## 🧰 What About Shared Code?

Don’t copy-paste shared code across apps like it’s 2002. Instead:

- Extract it into **libraries**.
- Use a **dependency manager** (npm, pip, Maven, etc.)
- Let each app bring in the shared code **cleanly and explicitly**.

This keeps your apps tidy, independent, and scalable.

---

## ✅ TL;DR Checklist

- [x] One codebase per app  
- [x] Use version control (Git FTW)  
- [x] Many deploys (dev, staging, prod, etc.) from the same codebase  
- [x] Don’t share a codebase between multiple apps  
- [x] Extract common code into reusable libraries  

---

## 🎉 Why This Matters

- Simplifies **collaboration** between devs.
- Makes **CI/CD pipelines** predictable.
- Keeps app environments **clean and consistent**.
- Lays the foundation for **scaling** and **portability**.

---

> 👩‍🚀 Your journey to building truly cloud-native apps starts with a clean, well-managed codebase. Make it count!

---

✨ Next stop: **Factor 2 – Dependencies** 👉 Stay tuned!
