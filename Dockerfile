FROM purduecsbridge/labs:autograder-latest

COPY ./src /autograder/source/src
COPY ./tests /autograder/source/tests