# libdev

[![Clojars Project](https://img.shields.io/clojars/v/libdev/clj-template.svg)](https://clojars.org/libdev/clj-template)

A [clj-new](https://github.com/seancorfield/clj-new) template for
building Clojure libraries that have a basic dev environment
configured.

The main difference over `clj-new`'s standard template is the
inclusion of an `env/dev` source path, that can contain bespoke
tooling to help develop a library.

We also setup a `:gen` alias that you can use to generate extra
templates within the project.

e.g. to add leiningen build support run the command:

`$ clj -A:gen project=group-name/project-name`

This will install leiningen configured with the
[lein-tools-deps](https://github.com/RickMoynihan/lein-tools-deps)
plugin, so you can use leiningen to build and deploy your `tools.deps`
project.

## Example Usage

Assuming you have installed `clj-new` in a `:new` alias, then you can
do:

```
$ clj -A:new libdev packagename/mylibname
Generating fresh 'clj new' libdev project.
$ tree mylibname/
mylibname/
├── deps.edn
├── env
│   └── dev
│       ├── dev.clj
│       └── user.clj
├── src
│   └── packagename
│       └── mylibname.clj
└── test
    └── packagename
        └── mylibname_test.clj

6 directories, 5 files
```

## Development

If you're working on libdev itself you can have it generate a new
template from the project root directory with the command:

Run: `clj -m clj-new.create libdev myname/mynewlib` to test

## License

Copyright Rick Moynihan © 2018

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
