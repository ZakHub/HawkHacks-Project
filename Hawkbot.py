import discord, random
from discord.ext import commands

client2 = commands.Bot(command_prefix="!")

  
@client2.command()
async def rps(ans, message):
  answer = message.lower()
  choices = [ "rock", "paper", "scissors"]
  bot_answers = random.choice(choices)
  if answer not in choices:
    await ans.send("INVALID OPTION")
    return
  else:
    if bot_answers == answer:
      await ans.send(f"TIE GAME")
    if bot_answers == "rock":
      if answer == "paper":
        await ans.send("YOU WIN!")
    if bot_answers == "paper":
      if answer== "rock":
        await ans.send("YOU LOSE!")
    if bot_answers == "scissors":
      if answer == "rock":
        await ans.send("YOU WIN!")
    if bot_answers =="rock":
      if answer == "scissors":
        await ans.send("YOU LOSE!")
    if bot_answers == "paper":
      if answer == "scissors":
        await ans.send("YOU WIN!")
    if bot_answers == "scissors":
      if answer == "rock":
        await ans.send("YOU LOSE!")   
         
@client2.event
async def on_ready():
  print('bot is ready to use as {0.user}'.format(client2))
  
client2.run(os.getenv('TOKEN'))
