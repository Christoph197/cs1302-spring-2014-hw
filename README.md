# CSCI 1302 Spring 2014 Homework Assignments

This is the <code>git</code> repository for Cotterell's Spring 2014 CSCI 1302
class. This repository will be updated frequently as different assignments
are added. Each assignment directory contains a <code>README.md</code> file
containing instructions for that particular assignment. If you browse the
repository via [GitHub](https://github.com/mepcotterell-cs1302/cs1302-spring-2014-hw),
then the Markdown (<code>.md</code>) files will be nicely formatted.

## Homework Assignments

Each assignment will contain at least two files: <code>README.md</code> and
<code>EXERCISES.md</code>. The <code>README.md</code> file contains the
instructions for that particular assignment. The <code>EXERCISES.md</code>
file contains starter Markdown text for the textbook excercises that are to be
completed. 

Additionaly, an assignment may contain an assortment of partially completed
<code>.java</code> files that are to be completed for the assignment. 
Instructions for these files are usually contained inside of the 
<code>.java</code> files as comments. The <code>README.md</code> file for
that assignment should indicate what <code>.java</code> files need to be
completed.

The <code>README.md</code> for each assignment also includes the
submission instructions.

## Downloading the Repository

In order to work on your homework assignments this semester, you'll need to 
"clone" the repository into your <code>nike.cs.uga.edu</code> account
for Homework 1. Don't worry about what that exactly means at the moment.
We'll cover <code>git</code> and other kinds of version control once
we're a little further into the semester. Once you've "cloned" the repository
once, you only need to "pull" changes from it in order to get the latest
version (explained below). Here is how you can "clone" the repository in
order to start working on Homework 1. 

 1. Login to your <code>nike.cs.uga.edu</code> account via SSH.
 2. Ensure that you're in your home directory by typing the following command
    into the prompt in the terminal shell:

    ```
    $ cd ~
    ```
 3. Clone the repository into your home directory using the following command:

    ```
    $ git clone http://github.com/mepcotterell-cs1302/cs1302-spring-2014-hw.git
    ```

Now, in order to work on Homework 1, you can simply <code>cd</code> into the
<code>cs1302-spring-2014-hw/hw1</code> directory that was created under your
home directory. When you get future homework assignments, they will be
located in a similar directory structure.

## Getting the Latest Homework Assignments

In order to get new homework assignments, you need to update your local copy
of the repository. This can be done by issuing the <code>$ git pull</code>
command from within the <code>cs1302-spring-2014-hw</code> directory. Assuming 
you followed the instructions in the previous section, this can be done using
the following commands:

```
$ cd ~/cs1302-spring-2014-hw
$ git pull
``

## Markdown Syntax

![Markdown Mark](https://raw.github.com/dcurtis/markdown-mark/master/png/66x40.png)

When editing your <code>EXERCISES.md</code> files, please be sure to consult the
[GitHub Flavored Markdown Guide](https://help.github.com/articles/github-flavored-markdown)
as well as the [Markdown Syntax Guide](http://daringfireball.net/projects/markdown/syntax)
to ensure that your document is properly formatted.


