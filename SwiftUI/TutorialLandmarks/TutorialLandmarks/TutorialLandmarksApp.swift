//
//  TutorialLandmarksApp.swift
//  TutorialLandmarks
//
//  Created by haksung on 2022/11/04.
//

import SwiftUI

@main
struct TutorialLandmarksApp: App {
    @StateObject private var modelData = ModelData()

    var body: some Scene {
        WindowGroup {
            ContentView()
                .environmentObject(modelData)
        }
    }
}
