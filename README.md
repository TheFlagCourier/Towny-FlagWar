# Flag War

## About Flag War

Flag War is a Towny Advanced project, and was formerly included within the main plugin.
(It still is, at present. This repository is an unadvertised work-in-progress.)

It was originally coded by [Chris Holland](https://github.com/Zren)
(AKA: [Shade](https://bukkit.org/members/shade.526/)),
with minor modifications over the years by the various Towny maintainers and contributors.

## About this repository

This repository is a work-in-progress repo, where I can get work done. Once a runnable plugin is
buildable, the repo will be moved into the TownyAdvanced group, and a PR submitted to remove
Flag War's legacy code from Towny proper.

## License and Redistribution

Towny, and by extension Flag War, is [licensed](https://creativecommons.org/licenses/by-nc-nd/3.0/)
in such a way that prevents the redistribution of derivative binaries. Until this is committed upstream, no
binaries will be offered.

## Changes from upstream:

- Uses a three-point versioning scheme, similar to SemVer.
  - MAJOR.MINOR.PATCH(-SNAPSHOT)
    - MAJOR: Denotes a major release, such as after a feature addition or breaking API changes.
    - MINOR: Non-breaking API changes, feature tweaks, etc.
    - PATCH: Focussed on bug fixes, or doesn't warrant a minor/major bump.
    - -SNAPSHOT: Denotes a development snapshot. Not intended for general use.

- Uses the Gradle build system over Apache Maven
  - Gradle can handle 99.9% of Maven tasks
  - It's super-fast.