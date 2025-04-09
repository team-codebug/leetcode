# 📦 Factor 2: Dependencies

> _“Explicitly declare and isolate dependencies.”_

---

## 🤹‍♂️ The Problem: Hidden Dependencies Are Sneaky

Imagine cloning a cool open-source app, running it, and getting:

```
ModuleNotFoundError: No module named 'flask'
```

😤 Classic!  
That’s what happens when an app **assumes** the system already has all the packages it needs. This is a big **NOPE** in the 12-Factor world.

---

## ✅ The 12-Factor Way

A twelve-factor app always:

1. **Declares every dependency explicitly**  
2. **Isolates those dependencies** from the rest of the system

This keeps your app **portable**, **predictable**, and **less likely to scream in production**.

---

## 🐍 Python + Flask: The Right Way

### 📟 Step 1: Declare Dependencies

Create a `requirements.txt` file in your repo:

```
flask==2.3.2
requests==2.31.0
gunicorn==21.2.0
```

📦 This is your app’s shopping list 🚲  
No guessing. No magic.

---

### 🧪 Step 2: Isolate Dependencies

Use a **virtual environment**:

```bash
python3 -m venv venv        # create a virtual env
source venv/bin/activate    # activate it
pip install -r requirements.txt
```

🪷 Boom! Your app now lives in its own little bubble.  
No conflicts with system Python or other projects.

---

## 🐳 Enter Docker: Your App in a Box

Docker takes this to the next level:  
No more “works on my machine” excuses. Ever.

Here’s a simple **Dockerfile** for a Flask app:

```dockerfile
# Use an official Python image
FROM python:3.11-slim

# Set the working directory
WORKDIR /app

# Copy requirements and install dependencies
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copy the rest of the code
COPY . .

# Expose the port your app runs on
EXPOSE 5000

# Run the app
CMD ["gunicorn", "-w", "4", "-b", "0.0.0.0:5000", "app:app"]
```

With this, your app runs in a clean, isolated environment **every single time**, no matter where it’s deployed.

---

### 🛠️ Build & Run:

```bash
docker build -t my-flask-app .
docker run -p 5000:5000 my-flask-app
```

🎉 Voilà! Your app is now running in a container with **only the dependencies it needs**.

---

## ⛔ Bonus Tip: Don’t Assume System Tools Exist

Need `curl` or `ImageMagick`?

Don’t assume they’ll magically exist on all machines — they probably won’t 😅  
Instead:

- Add them to your Dockerfile (`apt install curl`)
- Or vendor them into your app

🛡️ Stay in control.

---

## 🧑‍💻 Why This Matters

- 🚀 Easy onboarding — new devs just `git clone` and go
- 🧼 Clean environments — no “dependency pollution”
- 🔄 Reproducible builds — works the same everywhere
- 📦 Fully portable — across clouds, teams, and planets

---

> “If your app relies on hidden dependencies, it’s not a well-behaved app — it’s a ticking time bomb. 🎇”

---

➡️ Next up: **Config – environment variables FTW!**
