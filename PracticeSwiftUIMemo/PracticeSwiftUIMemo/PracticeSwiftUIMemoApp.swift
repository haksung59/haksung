//
//  PracticeSwiftUIMemoApp.swift
//  PracticeSwiftUIMemo
//
//  Created by haksung on 2022/11/01.
//

import SwiftUI

@main
struct PracticeSwiftUIMemoApp: App {
    let persistenceController = PersistenceController.shared

    var body: some Scene {
        WindowGroup {
            ContentView()
                .environment(\.managedObjectContext, persistenceController.container.viewContext)
        }
    }
}
