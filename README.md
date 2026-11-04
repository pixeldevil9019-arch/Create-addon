# Create: Aeronautics Expansion

A modular aircraft engine and control-systems addon for **Minecraft 1.21.1**, **NeoForge 21.1.x**, **Java 21**, and **Create 6.x**.

## Project direction

This project is intended to grow into a substantial aircraft systems addon—not a replacement flight simulator.

Planned systems:
- Aircraft Group Manager: named aircraft groups and persistent configuration.
- Component registry and diagnostics: connected, disconnected, unsupported and conflicting components.
- Engine management: component roles, rotation direction, target RPM and maximum RPM.
- Telemetry: engine state, fuel, actual RPM, thrust and available stress data.
- Create integration, implemented against verified APIs and versioned dependencies.

## Build

Use JDK 21 and run:

```bash
gradle --no-daemon build
```

The distributable JAR is written to `build/libs/`.

GitHub Actions runs the same build on pushes, pull requests and manual dispatch. Download the JAR from the workflow run's **Artifacts** section.

## Current milestone

The repository currently contains the NeoForge project skeleton, mod metadata, initial registry entries, basic item/block models and CI build workflow. The advanced aircraft management systems are not implemented yet. A successful CI build is required before calling this an installable release.

## Compatibility

Create is a required runtime dependency. This project currently targets Create 6.0.x on Minecraft 1.21.1. Optional aircraft/physics integrations will only be enabled after their exact versions and APIs are verified.
