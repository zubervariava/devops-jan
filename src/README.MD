Git
git account staging ?
commit ?

HEAD <----- POINTER TO THE COMMIT

git add . git commit -m "some message" git log --- to find the last commits

feature login/regitration page ---> unit test----> QA approved.

PR -----> pre prod ----> prod

Branch
Git branches are effectively a pointer to a snapshot of your changes.

to create a branch ----- -> git branch branch_name to check the list of branches --------> git branch
to switch to another branch --------> git checkout branch_name

to switch to another branch ---------> git switch branch_name shorthand to create and switch ---------> git checkout -b branch_name to another branch

to delete a branch ---------> git branch -d feature_mukunj

main ------- \

Staging
\ \
\ \ \
feature_surinder , feature_mukunj , feature_pragra

git -help ----- to the list of commands git log --help ----- to learn more about any command

Manager Task 1 ------------------------------------------------> Production Task 1

We ask our team to review our code ---PR review or pull request

// I am working on the journal 101....

Stash
whenever you want to save work in progress and continue from where you left off git add . -- to add to staging area git stash --- to add to stash (WIP)

.... to resume git stash pop -- to bring back/ resume from where you left of.

// adding some line in staging

staging