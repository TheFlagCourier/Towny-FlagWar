# _Flag&nbsp;War_

## About _Flag&nbsp;War_

_Flag&nbsp;War_ is a TownyAdvanced project, and was formerly included within the main plugin.

(It still is, at present. This repository is an unadvertised work-in-progress. Note: Until this is
committed upstream to the TownyAdvanced group, no binaries will be offered.)

It was originally coded by [Chris Holland](https://github.com/Zren)
(AKA: [Shade](https://bukkit.org/members/shade.526/)),
with minor modifications over the years by the various _Towny_ maintainers and contributors.

## About this repository

This repository is a `work-in-progress`, where I can get work done. Once a runnable plugin is
buildable, the repo will be moved into the TownyAdvanced group, and a PR submitted to remove
_Flag&nbsp;War_'s legacy code from _Towny_ proper.

## License and Redistribution

### _Flag&nbsp;War_ License

_Flag&nbsp;War_ is licensed under the [Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported (CC BY-NC-ND 3.0)](https://creativecommons.org/licenses/by-nc-nd/3.0/legalcode) license.
Additionally, those forking the project publicly in source-code format are licensed to do so, so
long as the derivative is not offered in a compiled executable format.
These license conditions are inherited from the legacy _Flag&nbsp;War_ implementation within
_Towny_.

### Third-Party Library and Tool Licenses

Since the segmentation from Towny, _Flag&nbsp;War_ has had to adapt where _Towny_ would have handled things
for it. While code for _Flag&nbsp;War_ is under the above license, libraries we use are covered under their
own. Below are links to the libraries we use, the author (or publisher), the library's license, and
why we use it.

|Library|Author / Publisher|License|Purpose|
|:---:|:---:|:---:|:---:|
|[Shadow](https://github.com/johnrengelman/shadow) | [John&nbsp;Engelman](https://github.com/johnrengelman) | [Apache&nbsp;2.0](https://github.com/johnrengelman/shadow/blob/master/LICENSE) | Gradle equivalent for the maven-shade-plugin |
|[_SimplixStorage_](https://github.com/Simplix-Softworks/SimplixStorage)|[Simplix&nbsp;Softworks](https://simplixsoft.com/)|[MIT](https://github.com/Simplix-Softworks/SimplixStorage/blob/master/LICENSE)| Data Access and Storage |

## Changes from upstream:
- Uses the Gradle build system over Apache Maven
  - Gradle can handle 99.9% of Maven tasks
  - It's super-fast.
  
- Handles it's own configuration via libraries. (See Third-Party Licenses.)

- Development targets Java 11.
  - Most servers are capable of running Java 11, which is also a requirement for _Paper_ starting
    with _Minecraft_ 1.17
    
  - If your host does not support Java 11, simply ask them if it's on their roadmap.