# libdev

[![Clojars Project](https://img.shields.io/clojars/v/libdev/clj-template.svg)](https://clojars.org/libdev/clj-template)

A [clj-new](https://github.com/seancorfield/clj-new) template for
building Clojure libraries that have a basic dev environment
configured.

The main difference over `clj-new`'s standard template is the
inclusion of an `env/dev` source path, that can contain bespoke
tooling to help develop a library.

## Usage

Assuming you have installed `clj-new` in a `:new` alias, then you can
do:

`clj -A:new libdev packagename/mylibname`

## Development

Run: `clj -m clj-new.create libdev myname/mynewlib` to test

## License

Copyright Rick Moynihan © 2018

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
