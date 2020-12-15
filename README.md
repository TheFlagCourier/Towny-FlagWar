# _Flag&nbsp;War_

## About _Flag&nbsp;War_

_Flag&nbsp;War_ is a TownyAdvanced project, and was formerly included within the main plugin, _Towny_.

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
  - Gradle can handle most Maven tasks.
  - While first run may be slow, it is _super-fast_ on sequential runs.
  
- _FlagWar_ handles its own configuration and localization, via SimplixStorage, rather than depending on Towny's
  integrated configuration system.

- Development targets Java 11.
  - This is in line with PaperMC and Velocity's build targets starting with Minecraft 1.17. 
  - Dedicated servers are fully capable of running on JDK 11, with packages in most major Linux distributions.
  - Hosting Platforms / Shared Hosts
    - Some hosts already support Java 11 Runtimes, but you may have to open a ticket.
    - Most hosts should follow after the update to 1.17, PaperMC is working directly with Pterodactyl panel to add support.