
# README.md - Homework Assignment 2

This assignment is out of 20 points is due on Monday 2014-03-03 @ 11:55 PM EST.

This assignment requires that you be able to login to the course Piazza page.
Here is a link: https://piazza.com/class/hqgwbgvtc3z3j8

## Resources

Instructions for how to download Homework 2 to your 
<code>nike.cs.uga.edu</code> are included in the main repository
<code>README.md</code> file. It is available on
[GitHub](https://github.com/mepcotterell-cs1302/cs1302-spring-2014-hw/blob/master/README.md).
If you already have a clone of the homewoek repository, then you should be able
to change into its directory and use the <code>git pull</code> command to pull in
the <code>hw2</code> directory.

If it says that permission is denied when you attempt to pull, then try issuing
the following commands inside of the repository directory before you attempt
to pull again:

```
$ git remote set-url origin git@github.com:mepcotterell-cs1302/cs1302-spring-2014-hw.git
```

If that does not solve the problem, then try this command before you attempt to pull again:

```
$ git remote set-url origin https://github.com/mepcotterell-cs1302/cs1302-spring-2014-hw.git
```

You should edit the files for this assignment directly (don't make copies of them)
using a plain text editor such as <code>emacs</code>, <code>vi</code>, or 
similar. Please be sure to include your name as well as the last three digits of
you 810 number within each of the files you submit.

## Submission Instructions

Please submit the following files:

 * Completed <code>EXERCISES.md</code> file. (20 points)

Assuming your repository is under <code>~/cs1302-spring-2014-hw</code>, you can
use the following commands to submit Homework 1:

```
$ cd ~/cs1302-spring-2014-hw
$ submit hw2 cs1302b
```

If you issued the commands correctly, then there should be a new
file in your <code>hw2</code> directory that is a timestamped
receipt of your submission. If we are unable to locate your submission,
then you'll need this receipt file in order resubmit your assignment
without any late penalty. 

It is also a good idea to email a copy of the assignment to yourself
after using the <code>submit</code> command (so that you have a
copy with the submission receipt in your records). To so this (assuming
your repository is under <code>~/cs1302-spring-2014-hw</code>), you can
simply execute the following commands:

```
$ cd ~/cs1302-spring-2014-hw
$ tar zcvf hw2.tar.gz hw2
$ mutt -s "[cs1302] hw2" -a hw2.tar.gz -- your@email.com < /dev/null
```

The steps above also create a <code>hw2.tar.gz</code> file in your
<code>cs1302-spring-2014-hw</code> directory. If you want, you
may delete this file. Take care not to accidentally delete your
<code>hw2</code> directory.

