import subprocess
try:
    subprocess.run("ping","www.google.es","-n","8")
except subprocess.CalledProcessError as e:
    print(e.output)

    