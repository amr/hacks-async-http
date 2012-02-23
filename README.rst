=====
What?
=====

This is a pretty quick and hopefully equally featured implementations of event-based
aync I/O HTTP servers written with 2 different server frameworks:

* NodeJS
* Netty

====
Why?
====

For comparison and benchmarks.

===========
How to run?
===========

NodeJS Server
=============

You need to have node installed. Then::

    node node/http-server.js

The node-based HTTP server is now listening on port `8080`.


Netty Server
============

You need to have the JVM and Maven installed. Then::

    cd netty-http-server/
	mvn dependency:copy-dependencies
	mvn package
	cd target/
	java -jar netty-http-server-VERSION_HERE.jar

THe netty-based HTTP server is now listening on port `9090`.

